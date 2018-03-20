package assignment2;

import java.util.Scanner;

public class BankAccountManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account acc1 = new Account();

        String depositor = "";
        long account_number = 0;
        char type = '0';
        double balance = 0;

        System.out.println("Enter initial account details :-");
        System.out.print("Depositor : ");
        depositor = input.nextLine();
        System.out.print("Account number : ");
        account_number = input.nextLong();
        System.out.print("Type : ");
        type = (char) input.next().charAt(0);
        System.out.print("Initial Balance : ");
        balance = input.nextDouble();

        acc1.setData(depositor, account_number, type, balance);

        while (true) {
            System.out.println("Operations :- ");
            System.out.println("1. Show depositor name");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int option = 0;
            while (option < 1 || option > 4) {
                System.out.print("Enter option : ");
                option = input.nextInt();
                if (option == 5) {
                    System.exit(0);
                }
                if (option < 1 || option > 4) {
                    System.out.println("Invalid option");
                }
            }

            int amount = 0;
            switch (option) {
                case 1:
                    System.out.println("Depositor : " + acc1.getDepositor());
                    break;
                case 2:
                    System.out.print("Deposit amount : ");
                    amount = input.nextInt();
                    acc1.deposit(amount);
                    System.out.println("Deposited : " + amount);
                    System.out.println("Balance : " + acc1.getBalance());
                    break;
                case 3:
                    System.out.print("Withdraw amount : ");
                    amount = input.nextInt();
                    System.out.println("Withdrawal attempt of : " + amount);
                    if (acc1.withdraw(amount)) {
                        System.out.println("Withdrawn : " + amount);
                    } else {
                        System.out.println("Not sufficient funds.");
                    }
                    System.out.println("Balance : " + acc1.getBalance());
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.println();
        }
    }

}

class Account {

    private String depositor;
    private long accountNumber;
    private char type;
    private double balance;

    public void setData(String depositor, long account_number, char type, double balance) {
        this.depositor = depositor;
        this.accountNumber = account_number;
        this.type = type;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getDepositor() {
        return depositor;
    }
    
    public double getBalance(){
        return balance;
    }
}
