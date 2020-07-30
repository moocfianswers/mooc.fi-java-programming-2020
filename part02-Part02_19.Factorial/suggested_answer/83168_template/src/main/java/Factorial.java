
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        int number = 1;
        while (number <= n) {
            factorial *= number;
            number++;
        }

        System.out.println("Factorial: " + factorial);
    }
}
