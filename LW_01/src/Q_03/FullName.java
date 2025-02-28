package Q_03;
import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter middle name: ");
        String middleName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        scanner.close();

        String fullName = firstName + " " + middleName.charAt(0) + ". " + lastName;

        System.out.println("Full Name: " + fullName);
    }
}
