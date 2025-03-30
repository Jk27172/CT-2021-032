package Q_02;
import Q_01.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        Temperature temp1 = new Temperature();
        temp1.setFahrenheit(fahrenheit);
        System.out.println("Equivalent Celsius: " + temp1.toCelsius());
    }
}
