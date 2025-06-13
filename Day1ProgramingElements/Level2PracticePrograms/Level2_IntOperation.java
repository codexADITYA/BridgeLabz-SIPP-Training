import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read three integers
        System.out.print("Enter first number (a): ");
        int a = input.nextInt();
        System.out.print("Enter second number (b): ");
        int b = input.nextInt();
        System.out.print("Enter third number (c): ");
        int c = input.nextInt();
        
        // Perform integer operations
        int operation1 = a + b * c; // b * c evaluated first due to precedence
        int operation2 = a * b + c; // a * b evaluated first
        int operation3 = c + (b != 0 ? a / b : 0); // a / b evaluated first
        int operation4 = (a % b) + c; // a % b evaluated first
        
        // Display result
        System.out.println("The results of Int Operations are " + operation1 + ", " + 
                          operation2 + ", " + operation3 + ", and " + operation4);
        
        // Close scanner
        input.close();
    }
}