import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter first number: ");
        float firstNum = s.nextFloat();
        System.out.print("Enter second number: ");
        float secondNum = s.nextFloat();

        System.out.println("Sum: " + (firstNum + secondNum));
        System.out.println("Difference: " + (firstNum - secondNum));
        System.out.println("Product: " + (firstNum * secondNum));

        if (secondNum != 0) {
            float quotient = firstNum / secondNum;
            System.out.printf("quotient: " + quotient);
        } else {
            System.out.println("cannot divide by zero");
        }

        s.close();
    }
}