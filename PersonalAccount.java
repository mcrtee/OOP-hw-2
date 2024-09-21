import java.sql.SQLOutput;
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
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            Amount withdrawalTransaction = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawalTransaction);
        }
    }
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
}
