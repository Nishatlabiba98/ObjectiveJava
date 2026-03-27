package rocks.zipcode.bankaccountlab;

/**
 * A savings account that accrues interest and allows withdrawals up to the current balance.
 */
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }

    @Override
    public void withdraw(double amount) {
        if (canWithdraw(amount)) {
            setBalance(getBalance() - amount);
        }
    }
}
