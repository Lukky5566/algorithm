package FactorialFibonacci;
import java.util.Scanner;
public class factorialfibonacci {
    public class FactorialFibonacci {
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for calculate: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 99) {
            System.out.println("Input out of range (0-99). Program terminated.");
            return;
        }
        System.out.println("Calculation " + number + " Factorial");
        int factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult = factorial(i);
            System.out.println(i + "! = " + factorialResult);
        }
        System.out.println("\nCalculation Fibonacci number " + number);
        int fibonacciResult = 0;
        for (int i = 0; i <= number; i++) {
            fibonacciResult = fibonacci(i);
            System.out.println("f" + i + " = " + fibonacciResult);
        }
        int result = factorial(number) - fibonacci(number);
        System.out.println("\n" + number + " Factorial minus Fibonacci number " + number + " is " + result);
        scanner.close();
    }
}
}