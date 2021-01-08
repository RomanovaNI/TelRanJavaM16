package lesson23;

import lesson21.HomeworkTwentyOne;

public class HomeworkTwentyThree {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        printer(maxEnd3(arr1));
        printer(maxEnd3(arr2));
        printer(maxEnd3(arr3));
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 3, 4};
        int[] arr6 = new int[]{7, 4, 6, 2};
        printer(makeEnds(arr4)); //→ [1, 3]
        printer(makeEnds(arr5));// → [1, 4]
        printer(makeEnds(arr6));// → [7, 2]
        int[] arr7 = new int[]{4, 5, 6};
        int[] arr8 = new int[]{1, 2};
        int[] arr9 = new int[]{3};
        printer(makeLast(arr7));// → [0, 0, 0, 0, 0, 6]
        printer(makeLast(arr8));// → [0, 0, 0, 2]
        printer(makeLast(arr9));// → [0, 3]
    }

    private static int[] makeLast(int[] input) {
        int[] result = new int[input.length * 2];
        result[0] = 0;
        result[result.length - 1] = input[input.length - 1];
        return result;
    }

    private static int[] makeEnds(int[] input) {
        int[] output = new int[2];
        output[0] = input[0];
        output[1] = input[input.length - 1];
        return output;
    }

    private static int[] maxEnd3(int[] input) {
        if (input[0] > input[2]) {
            for (int i = 0; i < input.length; i++) {
                input[i] = input[0];
            }
            return input;
        } else {
            for (int i = 0; i < input.length; i++) {
                input[i] = input[2];
            }
            return input;
        }
    }

    public static void printer(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}