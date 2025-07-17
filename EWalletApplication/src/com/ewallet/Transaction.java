package com.ewallet;

public class Transaction {
    private String type;
    private double amount;
    private User sender;
    private User receiver;

    public Transaction(String type, double amount, User receiver, User sender) {
        this.type = type;
        this.amount = amount;
        this.receiver = receiver;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Amount: $" + amount + 
               ", Sender: " + (sender != null ? sender.getName() : "N/A") + 
               ", Receiver: " + (receiver != null ? receiver.getName() : "N/A");
    }
}