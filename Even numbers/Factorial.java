import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = scanIn.nextInt();
        scanIn.close();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i; 
            System.out.println(i + "! = " + fact);
        }
    }
}
