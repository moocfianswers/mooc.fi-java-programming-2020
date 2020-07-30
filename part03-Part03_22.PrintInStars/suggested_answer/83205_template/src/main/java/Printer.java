
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int stars : array) {
            printStars(stars);
            System.out.println();
        }
    }

    public static void printStars(int howMany) {
        while (howMany > 0) {
            System.out.print("*");
            howMany = howMany - 1;
        }
    }
}
