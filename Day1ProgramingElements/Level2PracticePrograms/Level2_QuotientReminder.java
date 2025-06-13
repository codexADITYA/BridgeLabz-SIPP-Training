import java.util.Scanner;

class QuotientReminder {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read two numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number2 != 0 ? number1 / number2 : 0;
        int remainder = number2 != 0 ? number1 % number2 : 0;
        
        // Display result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                          " of two numbers " + number1 + " and " + number2);
        
        // Close scanner
        input.close();
    }
}