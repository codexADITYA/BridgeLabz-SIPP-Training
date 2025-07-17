package com.ewallet;

public abstract class Wallet {
    protected double balance;
    protected String walletType;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public abstract void transferTo(User receiver, double amount  );
}