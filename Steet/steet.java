package Steet;

import java.util.Scanner;

public class steet {
    public class EP3 {

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch); 
    }

    public static boolean isLower(char ch) {
        return Character.isLowerCase(ch); 
    }

    public static void toUpper(char[] ch) {
        ch[0] = Character.toUpperCase(ch[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        while (!isLetter(letter)) {
            System.out.println("Not a letter.");
            System.out.print("Enter a letter: ");
            letter = scanner.next().charAt(0);
        }

        if (isLower(letter)) {
            char[] letterArray = { letter }; 
            toUpper(letterArray);
            letter = letterArray[0]; 
        }

        System.out.println(letter);

        scanner.close();
        }
    }
}