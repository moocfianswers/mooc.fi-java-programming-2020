
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int biggest = list.get(0);
        int index = 0;
        while (index < list.size()) {
            if(biggest < list.get(index)) {
                biggest = list.get(index);
            }
            
            index++;
        }
        System.out.println("The greatest number: " + biggest);
    }
}
