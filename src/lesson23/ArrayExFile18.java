package lesson23;

import sun.plugin2.ipc.windows.WindowsNamedPipe;

public class ArrayExFile18 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(arr1));// → true
        System.out.println(unlucky1(arr2));// → true
        System.out.println(unlucky1(arr3));// → false
        int[] var1 = new int[]{1, 2, 3};
        int[] var2 = new int[]{1, 2, 3,};
        int[] var3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(var1));// → false
        System.out.println(sameFirstLast(var2));// → true
        System.out.println(sameFirstLast(var3)); //→ true
        int[] var4 = new int[]{1, 2, 3};
        int[] var5 = new int[]{5, 11, 2};
        int[] var6 = new int[]{7, 0, 0};
        int[] var7 = new int[]{7, 0, 0, 14};
        System.out.println(sum3(var4));// → 6
        System.out.println(sum3(var5));// → 18
        System.out.println(sum3(var6));// → 7
        System.out.println(sum3(var7));// → 21
        int[] var8 = new int[]{1, 2, 3};
        int[] var9 = new int[]{7, 2, 3};
        int[] var10 = new int[]{1, 2};
        int[] var11 = new int[]{1, 3};
        int[] var12 = new int[]{1};
        int[] var13 = new int[0];
        int[] var14 = new int[]{2, 2};
        int[] var15 = new int[]{2};

        System.out.println(start1(var8, var11));// →2
        System.out.println(start1(var9, var12));// →1
        System.out.println(start1(var10, var13));// →1
        System.out.println(start1(var14, var15));// →0

    }

    private static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count = count + 1;
        }
        return count;
    }

    private static int sum3(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private static int sum3Simple(int[] input) {
        int sum = input[0] + input[1] + input[2];
        return sum;
    }

    private static boolean sameFirstLast(int[] input) {
        return input[0] == input[input.length - 1] && input.length >= 1;
    }

    private static boolean unlucky1(int[] array) {
        if (array[0] == 1 && array[1] == 3 || array[1] == 1 && array[2] == 3 || array[array.length - 2] == 1 && array[array.length - 1] == 3) {
            return true;
        }
        return false;
    }
}
