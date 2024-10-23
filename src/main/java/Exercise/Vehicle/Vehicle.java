package Exercise.Vehicle;

import java.util.Scanner;

public class Vehicle {

    public String getType() {
        return type;
    }


    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    private Engine engine;
    private String type;
    private String model;

    public  Vehicle(String type, String model, Engine engine){
        this.type=type;
        this.model=model;
        this.engine=engine;
    }

    public void drive(double fuelLoss){
        this.engine.drive(fuelLoss);
    }

    public void displayInfo(){
        System.out.println("Vehicle Type: " + this.type);
        System.out.println("Vehicle Model: " + this.model);
        System.out.println("Engine Power: " + this.engine.getPower() + " HP");
        System.out.println("Remaining Fuel: " + this.engine.getFuel() + " units");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());

        Engine engine = new Engine(power, fuel);

        String type = scanner.nextLine();
        String model = scanner.nextLine();

        Vehicle vehicle = new Vehicle(type, model, engine);

        vehicle.displayInfo();

        // Driving the vehicle and losing fuel
        System.out.print("Enter fuel loss when driving: ");
        double fuelLoss = Double.parseDouble(scanner.nextLine());
        vehicle.drive(fuelLoss);

        // Final vehicle status
        vehicle.displayInfo();


    }
}
