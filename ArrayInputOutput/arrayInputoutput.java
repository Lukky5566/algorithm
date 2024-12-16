package ArrayInputOutput;
import java.util.Scanner;
public class arrayInputoutput {
    public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("\nIn order:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nReverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
}