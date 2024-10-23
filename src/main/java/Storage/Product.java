package Storage;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for the product properties
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total cost of this product (price * quantity)
    public double getTotalCost() {
        return this.price * this.quantity;
    }

    // Method to get product in JSON format
    public String toJson() {
        return "{ \"name\": \"" + this.name + "\", \"price\": " + this.price + ", \"quantity\": " + this.quantity + ", \"totalCost\": " + getTotalCost() + " }";
    }
}
