package DateValidator;
import java.util.Scanner;
public class datevalidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        while (true) {
            System.out.print("Enter day: ");
            day = scanner.nextInt();
            System.out.print("Enter month: ");
            month = scanner.nextInt();
            System.out.print("Enter year: ");
            year = scanner.nextInt();
            if (checkInput(day, month, year)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong value(s)");
            }
        }
        scanner.close();
    }
    public static boolean checkInput(int day, int month, int year) {
        if (year < 2500 || year > 2565) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false;
        }
        return true;
    }
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    } 
}