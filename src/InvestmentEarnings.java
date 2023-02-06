// Keeps track of the change in stock price after each trading day

import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestmentEarnings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter buying price per share: ");
        double buyingPrice = scanner.nextDouble();
        int day = 1;
        double closingPrice;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        while (true) {
            System.out.print("Enter closing price per share (negative number to quit): ");
            closingPrice = scanner.nextDouble();

            if (closingPrice < 0)
                break;

            double earnings = closingPrice - buyingPrice;
            if (earnings > 0)
                System.out.println("After day " + day + ", you earned " + decimalFormat.format(earnings) + " per share");
            else if (earnings < 0)
                System.out.println("After day " + day + ", you lost " + decimalFormat.format(-earnings) + " per share");
            else
                System.out.println("After day " + day + ", you did not earn money per share");
            day++;
        }
    }
}
