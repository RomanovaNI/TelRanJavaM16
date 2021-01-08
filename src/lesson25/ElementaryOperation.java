package lesson25;

public class ElementaryOperation {
    public static void main(String[] args) {
        int[] arr = myLovelyRandom(10);
        myLovelyPrint(arr);
        System.out.println(minValueInElementArray(arr));
        System.out.println(maxValueInElementArray(arr));
        System.out.println("Summmery is " + sumElementArray(arr));
        System.out.println("Middle value is " + middleValueElementInArray(arr));


    }

    private static double middleValueElementInArray(int[] arr) {
        double sum = sumElementArray(arr);
        return sum / arr.length;
    }

    private static int sumElementArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    private static String maxValueInElementArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return "max Element is " + max;
    }

    private static String minValueInElementArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return "min Element is " + min;
    }

    private static void myLovelyPrint(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] myLovelyRandom(int size) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * 100);
        }
        return result;
    }
}
