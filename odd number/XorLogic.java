import java.util.Scanner;

public class XorLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input P: ");
        int P = scanner.nextInt();

        System.out.print("Input Q: ");
        int Q = scanner.nextInt();

        int result;
        if ((P == 0 || P == 1) && (Q == 0 || Q == 1)) { 
            if ((P == 0 && Q == 1) || (P == 1 && Q == 0)) {
                result = 1;
            } else {
                result = 0;
            }
            System.out.println(P + " XOR " + Q + " = " + result);
        } else {
            System.out.println("Invalid input. P and Q must be 0 or 1.");
        }

        scanner.close();
    }
}
