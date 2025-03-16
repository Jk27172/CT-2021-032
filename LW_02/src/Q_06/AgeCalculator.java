package Q_06;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be " + age + " this year.");

        scanner.close();

    }
}
