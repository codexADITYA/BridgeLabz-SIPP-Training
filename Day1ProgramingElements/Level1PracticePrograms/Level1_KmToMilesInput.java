import java.util.Scanner;

class KmToMilesInput {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();
        
        // Define conversion factor
        double milesPerKilometer = 0.621371;
        
        // Calculate miles
        double miles = kilometers * milesPerKilometer;
        
        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km");
        
        // Close scanner
        input.close();
    }
}