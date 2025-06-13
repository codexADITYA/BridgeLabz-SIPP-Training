import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read height in centimeters
        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Convert to inches and feet
        double inchesPerCm = 0.393701;
        double totalInches = heightCm * inchesPerCm;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;
        
        // Display result
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);
        
        // Close scanner
        input.close();
    }
}