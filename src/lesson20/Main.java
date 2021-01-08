package lesson20;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        printArray (array);
        printArrayForEach(array);
    }

    public static void printArrayForEach(int[] array) {

    }

    public static void printArray(int[] input) {
        System.out.println("Start to print");
        System.out.print("Here is array ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+", ");
        }
        System.out.println();
    }
}
