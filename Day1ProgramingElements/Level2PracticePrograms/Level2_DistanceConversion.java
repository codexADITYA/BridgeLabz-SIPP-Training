import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert to yards and miles
        double feetToYards = 1.0 / 3.0;
        double yardsToMiles = 1.0 / 1760.0;
        double distanceInYards = distanceInFeet * feetToYards;
        double distanceInMiles = distanceInYards * yardsToMiles;
        
        // Display result
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", 
                         distanceInYards, distanceInMiles);
        
        // Close scanner
        input.close();
    }
}