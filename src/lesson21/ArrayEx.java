package lesson21;

import lesson19.HowToPrintIntArray;


public class ArrayEx {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{2, 3, 5};
        int[] a3 = new int[]{1, 2, 1};

        int[] b1 = new int[]{1, 2, 3, 4};
        int[] b2 = new int[]{7, 1, 2, 3, 4, 9};
        int[] b3 = new int[]{1, 2};

        HowToPrintIntArray.myPrint(makeMiddle(b1)); //→ [2, 3]
        HowToPrintIntArray.myPrint(makeMiddle(b2));//→ [2, 3]
        HowToPrintIntArray.myPrint(makeMiddle(b3));//→ [1, 2]

        HowToPrintIntArray.myPrint(fix23(a1)); //  [1, 2, 0]
        HowToPrintIntArray.myPrint(fix23(a2));// [2, 0, 5]
        HowToPrintIntArray.myPrint(fix23(a3));// [1, 2, 1]
    }

    private static int[] makeMiddle(int[] input) {
        int[] result = new int[2];
        result[0] = input[input.length / 2 - 1];
        result[1] = input[input.length / 2];
        return result;

    }

    public static int[] fix23(int[] input) {
        if (input[0] == 2 && input[1] == 3) {
            input[1] = 0;
        } else if (input[1] == 2 && input[2] == 3) {
            input[2] = 0;
        }
        return input;
    }

}
