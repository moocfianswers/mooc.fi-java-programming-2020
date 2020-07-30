

public class FromOneToParameter {

    public static void main(String[] args) {

    }

    public static void printUntilNumber(int number) {
        int numberToPrint = 1;
        while (numberToPrint <= number) {
            System.out.println(numberToPrint);
            numberToPrint = numberToPrint + 1;
        }
    }
}
