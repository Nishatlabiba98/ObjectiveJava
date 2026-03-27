package rocks.zipcode.bankaccountlab;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private static final double MINIMUM_BALANCE = 100.0;
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        if (interestRate < 0) throw new IllegalArgumentException("Interest rate cannot be negative");
        this.interestRate = interestRate;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        if (getBalance() - amount < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("Cannot withdraw. Minimum balance of " + MINIMUM_BALANCE + " must be maintained.");
        }
        return super.withdraw(amount);
    }


    
}
