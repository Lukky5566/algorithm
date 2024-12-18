package Converter;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.println("Choose the pattern: ");
        System.out.println("1. Square pattern");
        System.out.println("2. Rectangle with hollow center");
        System.out.println("3. X pattern");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        System.out.print("* "); 
                    }
                    System.out.println(); 
                }
                break;

            case 2:

                for (int i = 0; i < N; i++) {
                    System.out.print("* "); 
                }
                System.out.println();

                for (int i = 1; i < N - 1; i++) {
                    System.out.print("* ");
                    for (int j = 1; j < N - 1; j++) {
                        System.out.print("  "); 
                    }
                    System.out.println(""); 
                }

                for (int i = 0; i < N; i++) {
                    System.out.print(" "); 
                }
                break;

            case 3:

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (j == i || j == N - i - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}