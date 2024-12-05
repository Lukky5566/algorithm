import java.util.Scanner;

public class BanknoteCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter amount of money: ");
            int amount = scanner.nextInt();

            if (amount < 100 || amount % 100 != 0) {
                System.out.println("Please enter amount of money more than 100 Baht (ห้ามกรอกจำนวนเงินที่ได้เศษ 0-99 บาท)");
                continue;
            }

            int originalAmount = amount;

            int thousandBills = amount / 1000; 
            amount %= 1000;

            int fiveHundredBills = amount / 500;
            amount %= 500; 

            int hundredBills = amount / 100;

            System.out.println(originalAmount + " Baht can be separated into");
            System.out.println("1000-Baht " + thousandBills + " bills");
            System.out.println("500-Baht " + fiveHundredBills + " bills");
            System.out.println("100-Baht " + hundredBills + " bills");
            break;
        }

        scanner.close();
    }
}
