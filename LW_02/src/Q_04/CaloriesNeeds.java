package Q_04;
import java.util.Scanner;

public class CaloriesNeeds {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the body weight in pound: ");
        double bodyWeight = scanner.nextDouble();

        double calories = bodyWeight * 19;

        System.out.println("You need " + calories + " calories per day: ");

        scanner.close();
    }
}
