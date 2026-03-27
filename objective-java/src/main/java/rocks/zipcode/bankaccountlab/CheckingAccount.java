package rocks.zipcode.bankaccountlab;

/**
 * A checking account that allows withdrawals up to the current balance.
 */
public class CheckingAccount extends BankAccount {

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (canWithdraw(amount)) {
            setBalance(getBalance() - amount);
        }
    }
}
