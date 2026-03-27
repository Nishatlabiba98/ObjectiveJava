package rocks.zipcode.bankaccountlab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for BankAccount and its subclasses.
 */
public class BankAccountTest {

    @Test
    public void testCheckingAccountDeposit() {
        CheckingAccount account = new CheckingAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDepositZeroAmountHasNoEffect() {
        CheckingAccount account = new CheckingAccount(100.0);
        account.deposit(0.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testDepositNegativeAmountHasNoEffect() {
        CheckingAccount account = new CheckingAccount(100.0);
        account.deposit(-20.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testCheckingAccountWithdraw() {
        CheckingAccount account = new CheckingAccount(100.0);
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), 0.001);
    }

    @Test
    public void testCheckingAccountWithdrawInsufficientFunds() {
        CheckingAccount account = new CheckingAccount(50.0);
        account.withdraw(100.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    public void testSavingsAccountApplyInterest() {
        SavingsAccount account = new SavingsAccount(200.0, 0.05);
        account.applyInterest();
        assertEquals(210.0, account.getBalance(), 0.001);
    }

    @Test
    public void testBusinessAccountOverdraft() {
        BusinessAccount account = new BusinessAccount(100.0, 50.0);
        account.withdraw(130.0);
        assertEquals(-30.0, account.getBalance(), 0.001);
    }

    @Test
    public void testBusinessAccountOverdraftExceeded() {
        BusinessAccount account = new BusinessAccount(100.0, 50.0);
        account.withdraw(200.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}
