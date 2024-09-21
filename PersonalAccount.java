import java.util.ArrayList;
import java.util.List;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;

    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Amount depositTransaction = new Amount(amount, TransactionType.DEPOSIT);
            transactions.add(depositTransaction);
        }
    }
}
