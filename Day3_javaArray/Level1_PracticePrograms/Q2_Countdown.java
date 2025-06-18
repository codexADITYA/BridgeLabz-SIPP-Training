import java.util.Scanner;

public class Q2_Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer for countdown: ");
        int counter = scanner.nextInt();
        if (counter < 1) {
            System.out.println("Please enter a positive integer");
        } else {
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}