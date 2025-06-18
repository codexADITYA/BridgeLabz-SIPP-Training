import java.util.Scanner;

public class Q3_SumNaturalFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Please enter a natural number (positive integer)");
        } else {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println(sumLoop == sumFormula ? "Result is correct" : "Result is incorrect");
        }
        scanner.close();
    }
}