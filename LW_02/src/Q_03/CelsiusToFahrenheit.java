package Q_03;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (1.8 * celsius) + 32;

        System.out.print(celsius + " degrees celsius = " + fahrenheit + " degrees fahrenheit ");

        scanner.close();
    }
}
