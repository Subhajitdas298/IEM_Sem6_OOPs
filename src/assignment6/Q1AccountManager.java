package assignment6;

import java.util.Scanner;

public class Q1AccountManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = null;

        System.out.println("-: Creating account :- ");
        System.out.print("Customer name : ");
        String name = input.nextLine();
        System.out.print("Account no : ");
        String acc = input.nextLine();
        System.out.print("Opening balance : ");
        double balance = Double.parseDouble(input.nextLine());
        System.out.print("Account type (s/c) : ");
        String type = input.nextLine();
        if (type.toLowerCase().equals("s")) {
            account = new SavingsAccount(name, acc, balance);
        } else if (type.toLowerCase().equals("c")) {
            account = new CurrentAccount(name, acc, balance);
        } else {
            System.out.println("Invalid type\nExiting...");
            return;
        }

        while (true) {
            System.out.println("\nOptions :- ");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Deposit interest");
            System.out.println("5. Penalize for low balance");
            System.out.println("6. Exit");
            System.out.print("Enter option : ");

            int op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Balance : "
                            + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount : ");
                    double amountD = input.nextDouble();
                    System.out.println("Deposited : "
                            + account.deposit(amountD));
                    break;
                case 3:
                    System.out.print("Enter amount : ");
                    double amountW = input.nextDouble();
                    double change = account.withdraw(amountW);
                    if (change == -1) {
                        System.out.println("Balance too low");
                    } else {
                        System.out.println("Withdrawn : "
                                + change);
                    }
                    break;
                case 4:
                    System.out.println("Interest paid : "
                            + account.payInterest());
                    break;
                case 5:
                    System.out.println("Penalty subtracted : "
                            + account.penalize());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

abstract class Account {

    private String customerName;
    private String accountNumber;
    private double balance;

    private double interest;
    private double minBalance;
    private double noMinBalancePenalty;

    public Account(String customer, String accountNo,
            double openingBalance) {
        this.customerName = customer;
        this.accountNumber = accountNo;
        this.balance = openingBalance;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void setNoMinBalancePenalty(double penalty) {
        this.noMinBalancePenalty = penalty;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            return -1;
        }
    }

    public double payInterest() {
        double amount = balance * interest / 100;
        balance += amount;
        return amount;
    }

    public double penalize() {
        if (balance < minBalance) {
            double amount
                    = (noMinBalancePenalty < balance
                            ? noMinBalancePenalty : balance);
            balance -= amount;
            return amount;
        }
        return 0;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount(String customer,
            String accountNo, double openingBalance) {
        super(customer, accountNo, openingBalance);
        setInterest(3.5);
        setMinBalance(5000);
        setNoMinBalancePenalty(100);
    }

}

class CurrentAccount extends Account {

    public CurrentAccount(String customer,
            String accountNo, double openingBalance) {
        super(customer, accountNo, openingBalance);
    }

}
