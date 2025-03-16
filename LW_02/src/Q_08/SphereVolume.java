package Q_08;
import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius in meter: ");
        int r = scanner.nextInt();

        double v = (4.0/3.0) * (Math.PI * (Math.pow(r,3)));

        System.out.println("The volume of the sphere is: " + v + " cubic meter.");

        scanner.close();
    }
}
