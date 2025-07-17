package com.ewallet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Wallet wallet;
    private List<Transaction> transactionHistory;
    private double referralBonus;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
        this.transactionHistory = new ArrayList<>();
        this.referralBonus = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return wallet.getBalance();
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            wallet.loadMoney(amount);
            transactionHistory.add(new Transaction("Load Money", amount, null, this));
            System.out.println(name + " loaded $" + amount);
        }
    }

    public void transfer(User receiver, double amount) {
        if (amount > 0 && wallet.getBalance() >= amount) {
            wallet.transferTo(receiver, amount);
            transactionHistory.add(new Transaction("Transfer", amount, receiver, this));
            if (receiver.referralBonus > 0) {
                receive(referralBonus);
                referralBonus = 0; // Reset after applying
            }
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void receive(double amount) {
        wallet.loadMoney(amount);
        transactionHistory.add(new Transaction("Received", amount, this, null));
    }

    public void addReferralBonus(double bonus) {
        this.referralBonus += bonus;
        System.out.println(name + " received a referral bonus of $" + bonus);
    }

    public void viewTransactionHistory() {
        System.out.println(name + "'s Transaction History:");
        for (Transaction t : transactionHistory) {
            System.out.println(t);
        }
    }
}