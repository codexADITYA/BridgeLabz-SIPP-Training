import java.util.Scanner;

class DiscountedFeeInput {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read fee and discount percentage
        System.out.print("Enter course fee in INR: ");
        double fee = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();
        
        // Calculate discount amount and final fee
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        
        // Display result
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
        
        // Close scanner
        input.close();
    }
}