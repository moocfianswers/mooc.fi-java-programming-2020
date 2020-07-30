
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToPrint = Integer.valueOf(scanner.nextLine());
        while (numberToPrint <= 100) {
            System.out.println(numberToPrint);
            numberToPrint++;
        }
    }
}
