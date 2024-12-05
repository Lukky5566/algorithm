import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Fibonacci number: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Invalid input! Please enter a non-negative integer.");
            return;
        }

        System.out.println("Calculating…");

        int f0 = 0, f1 = 1;
        int currentFib = 0;

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                currentFib = f0;
            } else if (i == 1) {
                currentFib = f1;
            } else {
                currentFib = f0 + f1; 
                f0 = f1;
                f1 = currentFib;
            }
            System.out.println("f" + i + " = " + currentFib);
        }
        System.out.println("Value of Fibonacci is " + currentFib);
        scanner.close();
    }
}
