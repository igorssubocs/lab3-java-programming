import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();

        if (a == 0) {
            return;
        }

        double delta = b * b - 4 * a * c;
        System.out.printf("Delta = %.2f%n", delta);

        int roots;
        if (delta > 0) {
            roots = 2;
        } else if (delta == 0) {
            roots = 1;
        } else {
            roots = 0;
        }

        switch (roots) {
            case 2:
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("(two roots) x1 = " + x1 + "x2 = " + x2);
                break;
            case 1:
                double x0 = -b / (2 * a);
                System.out.printf("(one root) x1 = " + x0);
                break;
            default:
                break;
        }

    }
}