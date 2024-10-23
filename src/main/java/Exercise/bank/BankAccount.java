package Exercise.bank;

import Exercise.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankAccount {
    private int nextId= 1;
    private static int id; //Id: int (Starts from 1 and increments for every new account)
    private double balance;     // Balance: double

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate(int years) {
        return this.balance* interestRate*years;
    }
    public static void setInterestRate(double interest){
        interestRate=+interest;
    }
    public void deposit (double amount){
        this.balance+=amount;
    }

    private static double interestRate = 0.02; // Interest rate: double (Shared for all accounts. Default value: 0.02)

    public BankAccount (){
        this.id= nextId;
        this.balance=0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();
        int accountCount = 0;

        String[] commands = scanner.nextLine().split(" ");
        String command = commands[0];

        while (!command.equals("End")) {
            switch (command) {
                case "Create":
                    BankAccount newAccount = new BankAccount();
                    accounts.add(newAccount);
                    System.out.println("Account ID " + newAccount.getId() + " created.");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commands[1]);
                    double amount = Double.parseDouble(commands[2]);
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts.get(i).getId() == id) {
                            accounts.get(i).deposit(amount);
                            System.out.println("Deposited " + amount + " into account ID" + id);
                            break;
                        }
                    }
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(commands[1]);
                    setInterestRate(interestRate);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);
                    for (int i = 0; i < accountCount; i++) {
                        if (accounts.get(i).getId() == id) {
                            System.out.println("Interest for account ID" + id + " for " + years + " years is " + accounts.get(i).getInterestRate(years));
                            break;
                        }
                        break;
                    }
            }
            String newCommand = scanner.nextLine();
        }

        for (BankAccount account : accounts) {
            if (account.getId() == id) {
                System.out.println(account);
            }
        }
    }
}
