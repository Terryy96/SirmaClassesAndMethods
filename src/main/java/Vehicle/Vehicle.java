package Vehicle;

public class Vehicle {

    private String type;
    private String model;
    private Engine engine;

    public String getType() {
        return type;
    }
    public String getModel() {
        return model;
    }
    public Engine getEngine() {
        return engine;
    }

    public Vehicle(String type, String model, Engine engine) {
        this.type = type;
        this.model = model;
        this.engine = engine;
    }

    public void drive (double fuelLoss){
        this.engine.drive(fuelLoss);
    }
    public void displayInfo() {
        System.out.println("Vehicle Type: " + this.type);
        System.out.println("Vehicle Model: " + this.model);
        System.out.println("Engine Power: " + this.engine.getPower() + " HP");
        System.out.println("Remaining Fuel: " + this.engine.getFuel() + " units");
    }
}
