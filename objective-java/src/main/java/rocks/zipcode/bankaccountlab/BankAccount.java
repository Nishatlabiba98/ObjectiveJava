package rocks.zipcode.bankaccountlab;

/**
 * Abstract base class representing a bank account.
 * Subclasses can mutate balance via the protected setBalance method.
 */
public abstract class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(balance + amount);
        }
    }

    protected boolean canWithdraw(double amount) {
        return amount > 0 && amount <= getBalance();
    }

    public abstract void withdraw(double amount);
}
