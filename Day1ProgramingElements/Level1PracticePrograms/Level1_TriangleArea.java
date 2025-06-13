import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read base and height
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        // Calculate area in square centimeters and square inches
        double areaCm2 = 0.5 * base * height;
        double cmToInches = 0.393701;
        double areaIn2 = areaCm2 * cmToInches * cmToInches;
        
        // Display result
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn2, areaCm2);
        
        // Close scanner
        input.close();
    }
}