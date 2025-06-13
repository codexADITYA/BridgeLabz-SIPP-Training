import java.util.Scanner;

class TotalPrice {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read unit price and quantity
        System.out.print("Enter unit price in INR: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Display result
        System.out.println("The total purchase price is INR " + totalPrice + 
                          " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        
        // Close scanner
        input.close();
    }
}