import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read perimeter
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        
        // Calculate side length
        double side = perimeter / 4.0;
        
        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        // Close scanner
        input.close();
    }
}