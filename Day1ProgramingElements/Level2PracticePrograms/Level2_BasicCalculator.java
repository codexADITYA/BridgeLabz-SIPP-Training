import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        
        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : "undefined";
        
        // Display result
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                          number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + 
                          multiplication + ", and " + division);
        
        // Close scanner
        input.close();
    }
}