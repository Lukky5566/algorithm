import java.util.Scanner;

public class SocialSecurityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your salary: ");
        double salary = scanner.nextDouble();

        double welfare;
        if (salary <= 15000) {
            welfare = salary * 0.05;
        } else {
            welfare = 15000 * 0.05;
        }
        System.out.println("Your Welfare is " + welfare + " Baht");

        scanner.close();
    }
}
