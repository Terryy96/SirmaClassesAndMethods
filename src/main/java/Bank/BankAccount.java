package Bank;

import java.util.*;

public class BankAccount {
    private static int nextId = 1; // Static field to keep track of the next account ID
    private static double interestRate = 0.02; // Shared interest rate for all accounts

    private int id;
    private double balance;

    // Constructor
    public BankAccount() {
        this.id = nextId++; // Set the ID and increment the ID for the next account
        this.balance = 0.0; // Default balance
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return this.balance * interestRate * years;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }
}