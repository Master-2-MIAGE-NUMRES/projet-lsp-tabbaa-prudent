package accounts;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Les retraits ne sont pas autorisés depuis un compte épargne ! \uD83D\uDE2D ");
    }
}