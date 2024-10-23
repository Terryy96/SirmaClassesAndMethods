import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarConstructors {
    private String brand;
    private String model;
    private int horsepower;



    public CarConstructors(String brand, String model, int horsepower){
        this.brand=brand;
        this.model=model;
        this.horsepower=horsepower;
    }
    public CarConstructors(String brand){
        this.brand=brand;
        this.model="unknown";
        this.horsepower=-1;
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
        List<Exercise.CarConstructors> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] carData = scanner.nextLine().split(" ");
            if (carData.length == 1){
                String brand = carData[0];
                Exercise.CarConstructors car = new Exercise.CarConstructors(brand);
                cars.add(car);
            } else if (carData.length == 3) {
                String brand = carData[0];
                String model = carData[1];
                int horsepower = Integer.parseInt(carData[2]);

                Exercise.CarConstructors car = new Exercise.CarConstructors(brand, model, horsepower);
                cars.add(car);
            }
        }

        for (Exercise.CarConstructors car : cars){
            System.out.println(car.carInfo());
        }
    }

}
