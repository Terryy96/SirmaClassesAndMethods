package Vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter engine power: ");
        int power = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter initial fuel: ");
        double fuel = Double.parseDouble(scanner.nextLine());
        Engine engine = new Engine(power, fuel);

        // Create a vehicle
        System.out.print("Enter vehicle type: ");
        String type = scanner.next();

        System.out.print("Enter vehicle model: ");
        String model = scanner.next();
        Vehicle vehicle = new Vehicle(type, model, engine);

        // Display vehicle information
        vehicle.displayInfo();

        // Driving the vehicle and losing fuel
        System.out.print("Enter fuel loss when driving: ");
        double fuelLoss = Double.parseDouble(scanner.nextLine());
        vehicle.drive(fuelLoss);

        // Final vehicle status
        vehicle.displayInfo();

    }
}
