package rocks.zipcode.bankaccountlab;

/**
 * Created by leon on 1/10/18.
 */
public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (balance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount cannot be negative");
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void displayAccountInfo();
}
