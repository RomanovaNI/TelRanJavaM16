package lesson22;

import lesson21.HomeworkTwentyOne;

public class SmartMethodeIntArray {
    public static void main(String[] args) {
        int[] array = generateIntArray();
        HomeworkTwentyOne.printMaschine(array);
        HomeworkTwentyOne.printMaschine(generateIntArray());
    }

    public static int[] generateIntArray() {
        int dlina = randomGenerate(25);
        //System.out.println(randomLength);
        int[] output = new int[dlina];
        //MyPrintColorArray.print(output);
        for (int i = 0; i < output.length; i++) {
            output[i] = randomGenerate(25);
        }
        return output;
    }

    private static int randomGenerate(int size) {
        int myValue = (int) (Math.random() * size);
        if (myValue < 5) {
            myValue = 4;
        }
        return myValue;
    }
}