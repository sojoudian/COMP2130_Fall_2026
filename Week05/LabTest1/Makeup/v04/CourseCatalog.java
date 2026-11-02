import java.util.ArrayList;

public class CourseCatalog {
    public static void main(String[] args) {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Algebra", 250.00));
        courses.add(new Course("Biology", 300.00));
        courses.add(new OnlineCourse("Python", 280.00, 20));
        courses.add(new Course("History", 320.00));
        courses.add(new OnlineCourse("Design", 260.00, 30));

        System.out.println("=== Courses ===");
        for (Course c : courses) {
            System.out.println(c);
        }
        System.out.println("Courses offered: " + Course.getCount());

        double total = 0;
        int online = 0;
        Course highest = courses.get(0);
        for (Course c : courses) {
            total += c.getFinalPrice();
            if (c instanceof OnlineCourse) {
                online++;
            }
            if (c.getFinalPrice() > highest.getFinalPrice()) {
                highest = c;
            }
        }
        System.out.println("Online courses: " + online);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Highest: " + highest);
    }
}
