package lesson24;

public class HomeworkTwentyFour {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3, 4};
        int[] arr3 = new int[]{4, 4};
        int[] arr4 = new int[]{2, 2};
        int[] arr5 = new int[]{9, 2};
        int[] arr6 = new int[]{3, 4};
        printMaschine(plusTwo(arr1, arr2)); //→ [1, 2, 3, 4]
        printMaschine(plusTwo(arr3, arr4));// → [4, 4, 2, 2]
        printMaschine(plusTwo(arr5, arr6));// → [9, 2, 3, 4]

        int[] var1 = new int[]{1, 2, 3};
        int[] var2 = new int[]{1, 5, 3};
        int[] var3 = new int[]{5, 2, 3};
        int[] varTest1 = new int[]{7};
        int[] varTest2 = new int[]{5, 7, 8, 2, 3};//8
        System.out.println(maxTriple(var1));// → 3
        System.out.println(maxTriple(var2));// → 5
        System.out.println(maxTriple(var3));// → 5
        System.out.println(maxTriple(varTest1));//7
        System.out.println(maxTriple(varTest2));//8


        int[] var4 = new int[]{4, 5};
        int[] var5 = new int[]{1, 2, 3};
        int[] var6 = new int[]{4};
        int[] var7 = new int[]{1, 2, 3};
        int[] var8 = new int[0];
        int[] var9 = new int[]{1, 2};
        printMaschine(make2(var4, var5)); //→ [4, 5]
        printMaschine(make2(var6, var7));// → [4, 1]
        printMaschine(make2(var8, var9));// → [1, 2]

    }
    private static int[] make2(int[] a, int[] b) {
        int[] newArray = new int[2];
        if (a.length > 1) {
            newArray[0] = a[0];
            newArray[1] = a[1];
        } else if (a.length == 0) {
            newArray[0] = b[0];
            newArray[1] = b[1];
        } else {
            newArray[0] = a[0];
            newArray[1] = b[0];
        }
        return newArray;
    }

    private static int maxTriple(int[] array) {
        if (array[0] > array[array.length / 2] && array[0] > array[array.length - 1]) {
            return array[0];
        } else if (array[array.length / 2] > array[0] && array[array.length / 2] > array[array.length - 1]) {
            return array[array.length / 2];
        } else {
            return array[array.length - 1];
        }
    }

    private static int[] plusTwo(int[] a, int[] b) {
        int[] newArray = new int[4];
        newArray[0] = a[0];
        newArray[1] = a[1];
        newArray[2] = b[0];
        newArray[3] = b[1];

        return newArray;
    }

    public static void printMaschine(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println(array[array.length - 1] + "]");
    }
}

