public class Main {
    public static void main (String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Meerim");

        System.out.println(account.getAccountNumber() + " " + account.getAccountHolder() + ":");
        account.deposit(1000);
        account.withdraw(200);
        account.printTransactionHistory();

        System.out.println("Current Balance: $" + account.getBalance());
    }
}
