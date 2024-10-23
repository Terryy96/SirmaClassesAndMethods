import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

    private String brand;
    private String model;
    private int horsepower;



    public Car(String brand, String model, int horsepower){
        this.brand=brand;
        this.model=model;
        this.horsepower=horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }



    public String carInfo (){
        return String.format("The car is: %s %s - %d HP.", brand, model, horsepower);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Exercise.Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String [] input = scanner.nextLine().split(" ");
            String brand = input[0];
            String model = input [1];
            int horsepower = Integer.parseInt(input[2]);

            Exercise.Car car = new Exercise.Car(brand, model, horsepower);
            cars.add(car);
        }

        for (Exercise.Car car : cars){
            System.out.println(car.carInfo());
        }
    }
}
