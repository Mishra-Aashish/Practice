import java.util.Scanner;

class BankAccount {
    private double balance;   // hidden

    // method to set balance with validation
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println(" Deposit amount must be positive!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        // take initial balance from user
        System.out.print("Enter initial balance: ");
        double initBalance = sc.nextDouble();
        acc.setBalance(initBalance);

        // take deposit amount from user
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        // print final balance
        System.out.println("Final Balance: " + acc.getBalance());

        sc.close();
    }
}
