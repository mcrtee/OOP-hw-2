/**
 * Represents a transaction amount with its type.
 */
 class Amount {
    private double amount;
    private TransactionType transactionType;
    /**
     * Constructs an Amount with the specified amount and transaction type.
     *
     * @param amount the amount for the transaction
     * @param transactionType the type of transaction
     */
    public Amount(double amount, TransactionType transactionType ) {
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public double getAmount () {
        return amount;
    }
    public void setAmount (double newAmount) {
        amount = newAmount;
    }
    public TransactionType getTransactionType() {
        return transactionType;
    }
    public void setTransactionType (TransactionType newTransactionType) {
        transactionType = newTransactionType;

    }

}
