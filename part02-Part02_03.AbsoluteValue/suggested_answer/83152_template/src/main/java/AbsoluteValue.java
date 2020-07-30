
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = Integer.valueOf(scanner.nextLine());

        if (value < 0) {
            value = value * -1;
        }

        System.out.println(value);
    }
}
