package Simple;

import java.util.Scanner;

public class simple {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter Operation (+ - * / % ^): ");
        String operation = scanner.next();

        System.out.print("Enter Number y: ");
        double y = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "":
                result = x * y;
                break;
            case "/":
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            case "%":
                result = x % y;
                break;
            case "^":
                result = Math.pow(x, y); 
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        // แสดงผลลัพธ์
        System.out.println("Result: " + result);
    }
}