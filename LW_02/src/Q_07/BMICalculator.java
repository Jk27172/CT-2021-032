package Q_07;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        int w = scanner.nextInt();

        System.out.print("Enter your height in centimeters: ");
        int h = scanner.nextInt();

        double bmi = w / (Math.pow((h / 100.0),2));

        System.out.println("BMI = " + bmi);

        scanner.close();
    }
}
