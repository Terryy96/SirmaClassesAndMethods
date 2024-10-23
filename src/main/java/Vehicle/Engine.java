package Vehicle;

public class Engine {
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    private int power;
    private double fuel;

    public Engine (int power, double fuel){
        this.fuel=fuel;
        this.power=power;
    }

    public void drive(double fuelLoss) {
        if (fuelLoss > 0 && fuelLoss <= this.fuel) {
            this.fuel -= fuelLoss;
        }
    }
}
