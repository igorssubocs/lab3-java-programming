import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();

        int i = 0, min = 100, max = 0;

        while (i < 10) {
            int number = random.nextInt(100) + 1;
            System.out.print(number + " ");

            if (number < min) min = number;
            if (number > max) max = number;

            i++;
        }

        System.out.println("\nSmallest: " + min);
        System.out.println("Largest: " + max);
    }
}