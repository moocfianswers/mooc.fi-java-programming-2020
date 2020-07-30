
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        int smallest = list.get(0);
        int index = 0;
        while (index < list.size()) {
            if (list.get(index) < smallest) {
                smallest = list.get(index);
            }

            index++;
        }
        
        System.out.println("Smallest number: " + smallest);

        index = 0;
        while (index < list.size()) {
            if (list.get(index) == smallest) {
                System.out.println("Found at index: " + index);
            }

            index++;
        }

    }
}
