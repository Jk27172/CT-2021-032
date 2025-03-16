package Q_09;
import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your investment in dollars: ");
        double P = scanner.nextDouble();

        System.out.print("Enter the interest rate in percentage: ");
        double R = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int N = scanner.nextInt();

        double A = P * Math.pow(1 + (R/100),N);

        double earnedMoney = A - P;

        System.out.println(earnedMoney + " $ earned after " + N + " years " );

        scanner.close();
    }
}
