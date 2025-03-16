package Q_02;
import java.util.Scanner;

public class CmToFeetInches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double cm = scanner.nextDouble();

        double totalInches = cm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println(cm + " cm = " + feet + " feet " + inches + " inches");

        scanner.close();
    }
}
