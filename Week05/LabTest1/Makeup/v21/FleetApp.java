import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class FleetApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Vehicle> fleet = new ArrayList<>();
        boolean done = false;
        while (!done) {
            System.out.print("Enter the file name: ");
            String fileName = keyboard.nextLine();
            try (Scanner input = new Scanner(new File(fileName))) {
                int line = 0;
                while (input.hasNext()) {
                    line++;
                    try {
                        fleet.add(readVehicle(input));
                    } catch (IllegalArgumentException | InvalidTripException e) {
                        System.out.println("Line " + line + " skipped: " + e.getMessage());
                        input.nextLine();
                    }
                }
                done = true;
            } catch (FileNotFoundException e) {
                System.out.println("Cannot open " + fileName);
            }
        }

        Collections.sort(fleet);
        System.out.println("=== Fleet ===");
        for (Vehicle v : fleet) {
            System.out.println(v);
        }

        int discounted = 0;
        double discounts = 0;
        int totalKm = 0;
        double total = 0;
        for (Vehicle v : fleet) {
            if (v instanceof Discountable) {
                discounted++;
                discounts += ((Discountable) v).getDiscount(v.getCost());
            }
            totalKm += v.getTotalKm();
            total += v.getFinalCost();
        }
        System.out.println("Discounted vehicles: " + discounted);
        System.out.println("Discounts: $" + String.format(Locale.US, "%.2f", discounts));
        System.out.println("Total km: " + totalKm);
        System.out.println("Total to pay: $" + String.format(Locale.US, "%.2f", total));

        Vehicle first = fleet.get(0);
        Vehicle copy = first.clone();
        copy.setTrip(0, 200);
        System.out.println("=== Copy ===");
        System.out.println("Original: " + first);
        System.out.println("Copy: " + copy);
        System.out.println("Vehicles created: " + Vehicle.getCount());
    }

    private static Vehicle readVehicle(Scanner input) throws InvalidTripException {
        String type = input.next();
        String name = input.next();
        if (type.equals("VAN")) {
            int load = Integer.parseInt(input.next());
            return new Van(name, load, readTrips(input));
        } else if (type.equals("EVAN")) {
            int load = Integer.parseInt(input.next());
            int percent = Integer.parseInt(input.next());
            return new ElectricVan(name, load, percent, readTrips(input));
        } else if (type.equals("TRUCK")) {
            int axles = Integer.parseInt(input.next());
            return new Truck(name, axles, readTrips(input));
        } else {
            throw new IllegalArgumentException("Unknown type: " + type);
        }
    }

    private static int[] readTrips(Scanner input) {
        int n = Integer.parseInt(input.next());
        int[] trips = new int[n];
        for (int i = 0; i < n; i++) {
            trips[i] = Integer.parseInt(input.next());
        }
        return trips;
    }
}
