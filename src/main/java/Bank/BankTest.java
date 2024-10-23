package Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        while (true) {
            String command = scanner.next();

            if (command.equalsIgnoreCase("Create")) {
                // Create a new BankAccount and add it to the list
                BankAccount newAccount = new BankAccount();
                accounts.add(newAccount);
                System.out.println("Account ID " + newAccount.getId() + " created.");

            } else if (command.equalsIgnoreCase("Deposit")) {
                int id = scanner.nextInt();
                double amount = scanner.nextDouble();
                BankAccount account = findAccountById(accounts, id);

                if (account != null) {
                    account.deposit(amount);
                    System.out.println("Deposited " + amount + " to account ID " + id);
                } else {
                    System.out.println("Account not found.");
                }

            } else if (command.equalsIgnoreCase("SetInterest")) {
                double interest = scanner.nextDouble();
                BankAccount.setInterestRate(interest);
                System.out.println("Interest rate set to " + interest);

            } else if (command.equalsIgnoreCase("GetInterest")) {
                int id = scanner.nextInt();
                int years = scanner.nextInt();
                BankAccount account = findAccountById(accounts, id);

                if (account != null) {
                    double interest = account.getInterest(years);
                    System.out.println("Interest for account ID " + id + " for " + years + " years is " + interest);
                } else {
                    System.out.println("Account not found.");
                }

            } else if (command.equalsIgnoreCase("End")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }

    // Helper method to find a BankAccount by its ID
    private static BankAccount findAccountById(ArrayList<BankAccount> accounts, int id) {
        for (BankAccount account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }
}
