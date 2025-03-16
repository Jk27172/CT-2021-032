package Q_01;

public class NumericalExpression {
    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = 5;
        int X = 30;
        int Y = 15;
        int r = 7;

        double a = Math.sqrt(Math.pow(B,2) + 4 * A * C);
        double b = Math.sqrt(X + 4 * Math.pow(Y,3));
        double c = Math.cbrt(X * Y);
        double d = Math.PI * Math.pow(r,2);

        System.out.println("a. " + a);
        System.out.println("b. " + b);
        System.out.println("c. " + c);
        System.out.println("d. Area of the circle: " + d);

    }
}
