package com.ewallet;

public class PersonalWallet extends Wallet {
    public PersonalWallet(double initialBalance) {
        super(initialBalance);
        this.walletType = "Personal";
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            receiver.receive(amount);
            System.out.println(walletType + " Wallet: Transferred $" + amount + " to " + receiver.getName());
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}