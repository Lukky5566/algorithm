import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Input value A: ");
        int a = scanIn.nextInt();
        System.out.print("Input value B: ");
        int b = scanIn.nextInt();
        System.out.print("Input value C: ");
        int c = scanIn.nextInt();
        scanIn.close();

        System.out.print("Max value is ");
        boolean first = true;

        if (a >= b && a >= c) {
            System.out.print("A");
            first = false;
        }

        if (b >= a && b >= c) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print("B");
            first = false;
        }

        if (c >= a && c >= b) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print("C");
        }

        System.out.println();
    }
}
