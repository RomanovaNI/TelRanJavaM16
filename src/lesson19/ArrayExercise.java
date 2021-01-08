package lesson19;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 6};
        int[] array2 = new int[]{6, 1, 2, 3};
        int[] array3 = new int[]{13, 6, 1, 2, 3};
        int[] array4 = new int[]{6, 1, 2, 6};
       /* System.out.println(firstLast6(array1));// → true
        System.out.println(firstLast6(array2));// → true
        System.out.println(firstLast6(array3));// → false
        System.out.println(firstLast6(array4));// → true*/

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{7, 3};
        int[] c = new int[]{7, 3, 2};
        int[] d = new int[]{1, 3};
     /*   System.out.println(commonEnd(a, b));// →true
        System.out.println(commonEnd(a, c));// →false
        System.out.println(commonEnd(a, d));// →true*/

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};
        HowToPrintIntArray.myPrint (reverse3(a1));
        HowToPrintIntArray.myPrint (reverse3(a2));
        HowToPrintIntArray.myPrint (reverse3(a3));

        reverse3(a1);
        reverse3(a2);
        reverse3(a3);
    }

    private static int[] reverse3(int[] array) {
        int[] output = new int[3];
        output[0] = array[2];
        output[1] = array[1];
        output[2] = array[0];
        return output;

    }

    private static boolean commonEnd(int[] aFix, int[] notFix) {
        return aFix[0] == notFix[0] || aFix[aFix.length - 1] == notFix[notFix.length - 1];
    }

    private static boolean firstLast6(int[] input) {
        return input[0] == 6 || input[input.length - 1] == 6;
    }
}
