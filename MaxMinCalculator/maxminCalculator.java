package MaxMinCalculator;
import java.util.Scanner;
public class maxminCalculator {
    public class MaxMinCalculator {
    // ฟังก์ชันสำหรับหาค่าสูงสุด
    public static int mymax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static int mymin(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter last number: ");
        int num3 = scanner.nextInt();
        int max = mymax(num1, num2, num3);
        int min = mymin(num1, num2, num3);
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
        System.out.println("Total Max plus Min is " + (max + min));
        scanner.close();
        }
    }
}