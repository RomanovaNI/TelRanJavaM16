package lesson30;

import java.util.Arrays;

public class ArraysExFrom20To27 {
    public static void main(String[] args) {
        /*20. Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.*/
        int[] a1 = new int[]{1, 2, 3}; //[2, 3, 1]
        int[] a2 = new int[]{5, 11, 9};//[11, 9, 5]
        int[] a3 = new int[]{7, 0, 0};//[0, 0, 7]
        System.out.println("Result of exercise rotateLeft3:");
        System.out.println(Arrays.toString(rotateLeft3(a1)));
        System.out.println(Arrays.toString(rotateLeft3(a2)));
        System.out.println(Arrays.toString(rotateLeft3(a3)));
       /* 21.Given an array of ints, return the sum of the first 2 elements in the array.
       If the array length is less than 2, just sum up the elements that exist,
       returning 0 if the array is length 0.   */
        int[] b1 = new int[]{1, 2, 3}; //3
        int[] b2 = new int[]{1, 1}; //2
        int[] b3 = new int[]{1, 1, 1, 1}; //2
        int[] b4 = new int[]{3}; //3
        int[] b5 = new int[]{}; //0
        System.out.println("Result of exercise sum2:");
        System.out.println(sum2(b1));
        System.out.println(sum2(b2));
        System.out.println(sum2(b3));
        System.out.println(sum2(b4));
        System.out.println(sum2(b5));
        /*  22.Given an int array length 2, return true if it contains a 2 or a 3.*/
        int[] c1 = new int[]{2, 5};//true
        int[] c2 = new int[]{4, 3};//true
        int[] c3 = new int[]{4, 5};//false
        System.out.println("Result of exercise has23:");
        System.out.println(has23(c1));
        System.out.println(has23(c2));
        System.out.println(has23(c3));

        /*  23. Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.*/
        int[] d1 = new int[]{2, 2};//true
        int[] d2 = new int[]{3, 3};//true
        int[] d3 = new int[]{2, 3};//false
        int[] d4 = new int[]{3};//false
        int[] d5 = new int[]{};//false
        System.out.println("Result of exercise double23:");
        System.out.println(double23(d1));
        System.out.println(double23(d2));
        System.out.println(double23(d3));
        System.out.println(double23(d4));
        System.out.println(double23(d5));

       /* 24.Start with 2 int arrays, a and b, each length 2.
       Consider the sum of the values in each array.
       Return the array which has the largest sum. In event of a tie, return a..*/
        int[] e1 = new int[]{1, 2};
        int[] e2 = new int[]{3, 4};
        int[] f1 = new int[]{3, 4};
        int[] f2 = new int[]{1, 2};
        int[] g1 = new int[]{1, 1};
        int[] g2 = new int[]{1, 2};
        System.out.println("Result of exercise biggerTwo:");
        System.out.println(Arrays.toString(biggerTwo(e1, e2))); //[3, 4]
        System.out.println(Arrays.toString(biggerTwo(f1, f2)));// [3, 4]
        System.out.println(Arrays.toString(biggerTwo(g1, g2)));// [1, 2]

        /*25.Given an array of ints, swap the first and last elements in the array.
        Return the modified array. The array length will be at least 1.
         */
        int[] h1 = new int[]{1, 2, 3, 4}; //[4, 2, 3, 1]
        int[] h2 = new int[]{1, 2, 3}; //[3, 2, 1]
        int[] h3 = new int[]{8, 6, 7, 9, 5}; //[5, 6, 7, 9, 8]
        int[] h4 = new int[]{8}; //[ 8]
        System.out.println("Result of exercise swapEnds:");
        System.out.println(Arrays.toString(swapEnds(h1)));
        System.out.println(Arrays.toString(swapEnds(h2)));
        System.out.println(Arrays.toString(swapEnds(h3)));
        System.out.println(Arrays.toString(swapEnds(h4)));

        /*26.Given an int array of any length, return a new array of its first 2 elements.
        If the array is smaller than length 2, use whatever elements are present.
         */
        int[] i1 = new int[]{1, 2, 3}; //[ 1,2]
        int[] i2 = new int[]{1, 2}; //[ 1,2]
        int[] i3 = new int[]{1}; //[ 1]
        System.out.println("Result of exercise frontPiece:");
        System.out.println(Arrays.toString(frontPiece(i1)));
        System.out.println(Arrays.toString(frontPiece(i2)));
        System.out.println(Arrays.toString(frontPiece(i3)));

        /*27. Given 2 int arrays, a and b, of any length,
        return a new array with the first element of each array. If either array is length 0, ignore that array. */
        int[] j1 = new int[]{1, 2, 3};
        int[] j2 = new int[]{7, 9, 8};
        int[] k1 = new int[]{1};
        int[] k2 = new int[]{2};
        int[] l1 = new int[]{1, 7};
        int[] l2 = new int[]{};
        System.out.println("Result of exercise front11:");
        System.out.println(Arrays.toString(front11(j1, j2)));// [1, 7]
        System.out.println(Arrays.toString(front11(k1, k2)));// [1, 2]
        System.out.println(Arrays.toString(front11(l1, l2)));// [1]
    }

    private static int[] front11(int[] a, int[] b) {
        int[] c = new int[2];
        if (a.length == 0) {
            c = new int[1];
            c[0] = b[0];
        }
        if (b.length == 0) {
            c = new int[1];
            c[0] = a[0];
        } else {
            c[0] = a[0];
            c[1] = b[0];
        }
        return c;
    }

    private static int[] frontPiece(int[] array) {
        int[] outputArray = new int[2];
        if (array.length < 2) {
            return array;
        }
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = array[i];

        }
        return outputArray;
    }

    private static int[] swapEnds(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        int temp = newArray[0];
        newArray[0] = array[array.length - 1];
        newArray[newArray.length - 1] = temp;
        return newArray;
    }

    private static int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] > b[0] + b[1]) {
            return a;
        } else return b;
    }

    private static boolean double23(int[] inputArray) {
        if (inputArray.length < 2) {
            return false;
        }
        return inputArray[0] == 2 && inputArray[1] == 2 || inputArray[0] == 3 && inputArray[1] == 3;
    }

    private static boolean has23(int[] inputArray) {
        return inputArray[0] == 2 || inputArray[1] == 2 || inputArray[0] == 3 || inputArray[1] == 3;
    }

    private static int sum2(int[] inputArray) {
        int output = 0;
        if (inputArray.length > 1) {
            output = inputArray[0] + inputArray[1];
        }
        if (inputArray.length == 1) {
            output = inputArray[0];
        }
        return output;
    }

    private static int[] rotateLeft3(int[] input) {
        int[] output = new int[input.length];
        output[0] = input[1];
        output[1] = input[2];
        output[2] = input[0];
        return output;
    }
}
