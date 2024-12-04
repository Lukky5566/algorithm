public class SequenceCalculator {
    public static void main(String[] args) {

        System.out.println("8.1) Counting down sequence:");
        int sum1 = 0;
        int num1 = 10;
        while (num1 >= 1) {
            System.out.print(num1 + " "); 
            sum1 += num1;
            num1--;
        }
        System.out.println("\nSum = " + sum1);

        System.out.println("\n8.2) Odd numbers sequence:");
        int sum2 = 0;
        for (int num2 = 1; num2 <= 19; num2 += 2) {
            System.out.print(num2 + " "); 
            sum2 += num2;
        }
        System.out.println("\nSum = " + sum2);

        System.out.println("\n8.3) Alternating sign sequence:");
        int sum3 = 0;
        int num3 = 1;
        boolean isPositive = true; 
        while (num3 <= 19) {
            if (isPositive) {
                System.out.print(num3 + " ");
                sum3 += num3;
            } else {
                System.out.print(-num3 + " ");
                sum3 -= num3;
            }
            isPositive = !isPositive; 
            num3 += 2; 
        }
        System.out.println("\nSum = " + sum3);
    }
}