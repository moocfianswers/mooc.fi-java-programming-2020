
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highest = Integer.valueOf(scanner.nextLine());
        int printing = 0;
        while (printing <= highest) {
            System.out.println(printing);
            printing++;
        }
    }
}
