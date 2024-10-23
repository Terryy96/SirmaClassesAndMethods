package Exercise.Vehicle;

public class Engine {

    private int power;

    public int getPower() {
        return power;
    }

    public double getFuel() {
        return fuel;
    }

    private double fuel;


    public Engine (int power, double fuel){
        this.power=power;
        this.fuel=fuel;
    }

    public void drive (double fuelLoss){
        this.fuel-=fuelLoss;
    }

}
