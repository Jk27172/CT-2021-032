package Q_02;

import java.util.Scanner;

public class NumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter an integer (negative to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                int temp = number;
                int digitCount = 0;

                if (temp == 0) {
                    digitCount = 1;
                } else {
                    while (temp != 0) {
                        temp /= 10;
                        digitCount++;
                    }
                }
                System.out.println("Number of digits: " + digitCount);
            }
        } while (number >= 0);

        scanner.close();
    }
}
