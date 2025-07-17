package com.ewallet;

public class BusinessWallet extends Wallet {
    private double transactionLimit;

    public BusinessWallet(double initialBalance, double transactionLimit) {
        super(initialBalance);
        this.walletType = "Business";
        this.transactionLimit = transactionLimit;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > 0 && amount <= transactionLimit && balance >= amount) {
            balance -= amount;
            receiver.receive(amount);
            System.out.println(walletType + " Wallet: Transferred $" + amount + " to " + receiver.getName() + " (Limit: $" + transactionLimit + ")");
        } else {
            System.out.println("Transaction exceeds limit or insufficient balance");
        }
    }
}