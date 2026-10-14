// File: Week06.java
import java.util.Arrays;

public class Week06 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Intern bob = new Intern("Bob", 20, new int[]{8, 6, 4});
        Employee[] staff = {new Manager("Ann", 5000), bob};
        for (Employee e : staff) {
            System.out.println(e);
            if (e instanceof Bonus) {
                System.out.println("  bonus " + ((Bonus) e).bonus());
            }
        }
        Arrays.sort(staff);
        System.out.println(Arrays.toString(staff));
        Intern copy = bob.clone();
        copy.hours[0] = 2;
        System.out.println(bob + " / " + copy);
    }
}

abstract class Employee implements Comparable<Employee> {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double pay();

    @Override
    public int compareTo(Employee other) {
        return Double.compare(pay(), other.pay());
    }

    @Override
    public String toString() {
        return name + " " + pay();
    }
}

interface Bonus {
    double bonus();
}

class Manager extends Employee implements Bonus {
    private double salary;

    public Manager(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public double bonus() {
        return salary / 10;
    }
}

class Intern extends Employee implements Cloneable {
    private double rate;
    int[] hours;

    public Intern(String name, double rate, int[] hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        int total = 0;
        for (int h : hours) {
            total += h;
        }
        return total * rate;
    }

    @Override
    public Intern clone() throws CloneNotSupportedException {
        Intern copy = (Intern) super.clone();
        copy.hours = hours.clone();
        return copy;
    }
}