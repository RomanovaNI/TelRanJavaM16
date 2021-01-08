package lesson21;

public class HomeworkTwentyOne {
    public static void main(String[] args) {

        int[] c1 = new int[]{1, 2, 3, 4, 5};
        int[] c2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] c3 = new int[]{1, 2, 3};
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        System.out.println(ANSI_YELLOW);
        printMaschine(midThree(c1));//[2, 3, 4]
        System.out.print(ANSI_RED + ANSI_CYAN_BACKGROUND);
        printMaschine(midThree(c2));//[7, 5, 3]
        System.out.print(ANSI_RESET);
        System.out.print(ANSI_GREEN);
        printMaschine(midThree(c3));//[1, 2, 3]
    }

    private static int[] midThree(int[] input) {
        int[] output = new int[3];
        output[0] = input[input.length / 2 - 1];
        output[1] = input[input.length / 2];
        output[2] = input[input.length / 2 + 1];
        return output;
    }

    public static void printMaschine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void printMaschineDouble(double[] array) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

        System.out.print(ANSI_GREEN_BACKGROUND + "[ " + ANSI_RESET);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(ANSI_YELLOW + array[i] + ", " + ANSI_RESET);
        }
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + array[array.length - 1] + " ]" + ANSI_RESET);
    }
}
