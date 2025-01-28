import accounts.BankAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.print("TD3 - PRUDENT TABBAA\n");

        BankAccount savingsAccount = new SavingsAccount("2", 69069);
        savingsAccount.deposit(666);
        System.out.println("Solde compte épargne : " + savingsAccount.getBalance());

        try {
            savingsAccount.withdraw(200);
        } catch (UnsupportedOperationException e) {
            System.out.println(e);
        }
    }
}