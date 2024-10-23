package Storage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the storage with a certain capacity
        System.out.print("Enter storage capacity: ");
        double storageCapacity = scanner.nextDouble();
        Storage storage = new Storage(storageCapacity);

        // Add products to the storage
        while (true) {
            System.out.println("Enter product details (name price quantity) or type 'exit' to stop:");

            // Read the input
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            // Read the rest of the product details
            String name = input;
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();

            // Create a product and add it to storage
            Product product = new Product(name, price, quantity);
            storage.addProduct(product);
        }

        // Print all products in storage in JSON format
        System.out.println("All products in storage:");
        System.out.println(storage.getProducts());

        // Print remaining storage capacity
        System.out.println("Remaining capacity in storage: " + storage.getRemainingCapacity());
    }
}