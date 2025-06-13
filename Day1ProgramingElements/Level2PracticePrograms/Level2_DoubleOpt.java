import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read three double values
        System.out.print("Enter first number (a): ");
        double a = input.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = input.nextDouble();
        System.out.print("Enter third number (c): ");
        double c = input.nextDouble();
        
        // Perform double operations
        double operation1 = a + b * c; // b * c evaluated first due to precedence
        double operation2 = a * b + c; // a * b evaluated first
        double operation3 = c + (b != 0 ? a / b : 0.0); // a / b evaluated first
        double operation4 = (a % b) + c; // a % b evaluated first
        
        // Display result
        System.out.println("The results of Double Operations are " + operation1 + ", " + 
                          operation2 + ", " + operation3 + ", and " + operation4);
        
        // Close scanner
        input.close();
    }
}