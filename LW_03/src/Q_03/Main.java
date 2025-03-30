package Q_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = scanner.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double area = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.println("Shaded area: " + area);
    }
}
