package lesson20;

public class ExercisesArray {
    public static void main(String[] args) {
/*        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 7, 7};
        int[] a3 = new int[]{5, 2, 9};
        int[] b1 = new int[]{4, 5, 6};
        int[] b2 = new int[]{3, 8, 0};
        int[] b3 = new int[]{1, 4, 5};
        Main.printArrayForEach(middleWay(a1, b1)); // → [2, 5]
        Main.printArrayForEach(middleWay(a2, b2)); // → [7, 8]
        Main.printArrayForEach(middleWay(a3, b3)); // → [2, 4]*/
        // Given 2 int arrays, a and b, each length 3,
        // return a new array length 2 containing their middle elements.

        int[] c1 = new int[]{4, 5};
        int[] c2 = new int[]{4, 2};
        int[] c3 = new int[]{3, 5};

        System.out.println(no23(c1)); //→ true
        System.out.println(no23(c2)); //→ false
        System.out.println(no23(c3)); //→ false
    }

    private static boolean no23(int[] array) {
        if (array[0] == 2 || array[0] == 3 || array[1] == 3 || array[1] == 2) {
            return false;
        }
        return true;
    }

    private static int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }

}
