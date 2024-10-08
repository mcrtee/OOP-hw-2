import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a personal bank account with functionality to manage transactions.
 */
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private List<Amount> transactions;

    /**
     * Constructs a PersonalAccount with an account number and account holder's name.
     *
     * @param accountNumber the unique identifier for the account
     * @param accountHolder the name of the account holder
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount the amount to be deposited; must be positive
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Amount depositTransaction = new Amount(amount, TransactionType.DEPOSIT);
            transactions.add(depositTransaction);
            System.out.println("Deposited: $" + amount);
        }
        else {
            System.out.println("Deposit amount must be positive");
        }
    }
    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount the amount to be withdrawn; must be positive and not exceed the current balance
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            Amount withdrawalTransaction = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawalTransaction);
            System.out.println("Withdraw: $" + amount);
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    /**
     * Prints the transaction history of the account.
     * Displays all deposit and withdrawal transactions.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        if (transactions.isEmpty()) {
            System.out.println("No transactions availale");
        }
        else {
            for (Amount transaction : transactions) {
                System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
            }
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
