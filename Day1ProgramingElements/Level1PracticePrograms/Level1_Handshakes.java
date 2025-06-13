import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt and read number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display result
        System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                          " students is " + maxHandshakes);
        
        // Close scanner
        input.close();
    }
}