package lesson30;

public class HomeworkThirty {
    public static void main(String[] args) {
        double[] array = createRandomDoubleArray(10);
        printDoubleArray(array);
        printDoubleArray(bubbleSortDoubleArray(array));
        printDoubleArray(addElementDoubleArray(5, 3.14, array));
        printDoubleArray(deleteElementDoubleArray(3, array));
        printDoubleArray(updateElementDoubleArray(2, 7.77, array));
        printDoubleArray(fillArray(array));
    }

    private static double[] fillArray(double[] array) {
        double[] newArray = createRandomDoubleArray(10);

        return newArray;
    }

    private static double[] updateElementDoubleArray(int index, double element, double[] array) {
        double[] newArray = new double[array.length];
        newArray[index] = element;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;
        return newArray;
    }

    private static double[] deleteElementDoubleArray(int index, double[] array) {
        double[] newArray = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }

    private static double[] addElementDoubleArray(int index, double element, double[] array) {
        double[] newArray = new double[array.length + 1];
        newArray[index] = element;
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    private static double[] bubbleSortDoubleArray(double[] array) {
        int count;
        do {
            count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    double temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }
        while (count > 0);
        return array;
    }


    private static double[] createRandomDoubleArray(int size) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 1000;
            int magicArray = (int) array[i];
            array[i] = (double) magicArray / 100;
        }
        return array;
    }

    private static void printDoubleArray(double[] array) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

        System.out.print(ANSI_BLACK_BACKGROUND+ ANSI_WHITE+"[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println(array[array.length - 1] + " ]"+ANSI_RESET);
    }
}
