
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number < lowerLimit) {
                continue;
            }

            if (number > upperLimit) {
                continue;
            }

            System.out.println(number);
        }
    }
}
