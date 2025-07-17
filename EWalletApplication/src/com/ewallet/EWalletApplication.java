package com.ewallet;

public class EWalletApplication {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("Alice", new PersonalWallet(1000));
        User user2 = new User("Bob", new BusinessWallet(2000, 500));

        // Load money
        user1.loadMoney(500);
        user2.loadMoney(1000);

        // Add referral bonus
        user1.addReferralBonus(50);
        user2.addReferralBonus(30);

        // Perform transfers
        System.out.println("\nInitial Balances:");
        System.out.println("Alice: $" + user1.getBalance());
        System.out.println("Bob: $" + user2.getBalance());

        user1.transfer(user2, 300);
        user2.transfer(user1, 600); // Should fail due to limit
        user2.transfer(user1, 200);

        // View transaction history
        user1.viewTransactionHistory();
        user2.viewTransactionHistory();

        // Final balances
        System.out.println("\nFinal Balances:");
        System.out.println("Alice: $" + user1.getBalance());
        System.out.println("Bob: $" + user2.getBalance());
    }
}