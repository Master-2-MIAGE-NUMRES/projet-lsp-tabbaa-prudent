package accounts;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber, double balance) {
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
        if (balance > 0) {
            balance -= amount;
        }
        else {
            throw new UnsupportedOperationException("Vous etes povre #LOSER \uD83D\uDE2D");
        }
    }


}
