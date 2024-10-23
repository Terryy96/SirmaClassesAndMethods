package Storage;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private double capacity;
    private List<Product> products;

    // Constructor for Storage
    public Storage(double capacity) {
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    // Method to add a product to storage
    public boolean addProduct(Product product) {
        // Calculate the total quantity of product being added
        int totalQuantity = product.getQuantity();

        // Check if storage has enough capacity to add the product
        if (this.capacity >= totalQuantity) {
            this.products.add(product);
            this.capacity -= totalQuantity; // Decrease the capacity by product quantity
            System.out.println("Added product: " + product.getName() + ", remaining capacity: " + this.capacity);
            return true;
        } else {
            System.out.println("Not enough capacity to add product: " + product.getName());
            return false;
        }
    }

    // Method to get all products in storage in JSON format
    public String getProducts() {
        StringBuilder jsonBuilder = new StringBuilder();
        for (Product product : this.products) {
            jsonBuilder.append(product.toJson()).append("\n");
        }
        return jsonBuilder.toString();
    }

    // Method to get remaining capacity
    public double getRemainingCapacity() {
        return this.capacity;
    }
}


