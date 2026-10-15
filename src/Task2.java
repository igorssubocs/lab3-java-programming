import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your height in meters (e.g. 1.80): ");
        float height = s.nextFloat();
        System.out.println("Enter your weight in kg (e.g. 75): ");
        float weight = s.nextFloat();

        float bmi = (float) (weight / Math.pow(height, 2));
        System.out.println("Your BMI: " + bmi);

        if (bmi < 16.00) System.out.println("starvation");
        else if (bmi < 17.00) System.out.println("emaciation");
        else if (bmi < 18.50) System.out.println("underweight");
        else if (bmi < 23.00) System.out.println("normal, low range");
        else if (bmi < 25.00) System.out.println("normal, high range");
        else if (bmi < 27.50) System.out.println("overweight, low range");
        else if (bmi < 30.00) System.out.println("overweight, high range");
        else if (bmi < 35.00) System.out.println("1st degree obesity");
        else if (bmi < 40.00) System.out.println("2nd degree obesity");
        else System.out.println("3rd degree obesity");

        s.close();
    }
}