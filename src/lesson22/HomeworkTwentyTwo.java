package lesson22;

import lesson21.HomeworkTwentyOne;

public class HomeworkTwentyTwo {
    public static void main(String[] args) {
        double[] array = generateDoubleArray();
        HomeworkTwentyOne.printMaschineDouble(array);
        double x = 12.3;
        HomeworkTwentyOne.printMaschineDouble(insertSpecificIndexElement(array, x, 0));
        HomeworkTwentyOne.printMaschineDouble(updateElement(array, x, 1));
        HomeworkTwentyOne.printMaschineDouble(deleteElement(array, 2));
    }

    public static double[] deleteElement(double[] array, int index) {
        //delete one element on specific index
        double[] output = new double[array.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        for (int i = index; i < output.length; i++) {
            output[i] = array[i + 1];
        }
        return output;
    }

    public static double[] updateElement(double[] array, double element, int index) {
        // update one element on specific index.
        double[] output = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
        }
        output[index] = element;
        return output;
    }

    public static double[] insertSpecificIndexElement(double[] array, double element, int index) {
        //insert new element on specific index into array
        double[] output = new double[array.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = array[i];
        }
        for (int i = index; i < array.length; i++) {
            output[i + 1] = array[i];
        }
        return output;
    }

    private static double[] generateDoubleArray() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        //Plz create random double array with size = 10;
        int randomLength = 10;
        //  System.out.println(randomLength);
        double[] output = new double[randomLength];
        // HomeworkTwentyOne.printMaschineDouble(output);
        for (int i = 0; i < output.length; i++) {
            output[i] = Math.random() * 3.1 * 1000;
            int magicOutpit = (int) output[i];
            output[i] = (double) magicOutpit / 100;
            //  HomeworkTwentyOne.printMaschineDouble(output);
        }
        return output;

    }
}
