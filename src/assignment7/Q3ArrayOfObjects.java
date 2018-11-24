package assignment7;

public class Q3ArrayOfObjects {

    public static void main(String[] args) {
        int count = 3;

        Account[] accounts = new Account[count];
        for (int i = 0; i < count; i++) {
            accounts[i] = new Account();
        }

        accounts[0].setData("Triss", 1234, 's', 100);
        accounts[1].setData("Yen", 1235, 's', 120);
        accounts[2].setData("Ciri", 1236, 'c', 40);

        System.out.println("All accounts are :-");
        for (Account acc : accounts) {
            System.out.println(acc.toString());
        }
    }
}

class Account {

    private String depositor;
    private long accountNumber;
    private char type;
    private double balance;

    public void setData(String depositor, long account_number,
                        char type, double balance) {
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

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account no : " + accountNumber + "\n"
                + "Type : " + type + "\n"
                + "Owner : " + depositor + "\n"
                + "Balance : " + balance + "\n";
    }
}
