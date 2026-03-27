package rocks.zipcode.bankaccountlab;

/**
 * A business account that supports an overdraft limit for withdrawals.
 */
public class BusinessAccount extends BankAccount {

    private double overdraftLimit;

    public BusinessAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        }
    }
}
