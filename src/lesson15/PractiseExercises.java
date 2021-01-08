package lesson15;

public class PractiseExercises {
    public static void main(String[] args) {
        printLineNtimes("hello", 3);
        printLineNtimes("Java", 5);
        System.out.println();
        System.out.println(printLineNtimesString("Love", 2));
        countdown(5);
        System.out.println(digitPowTwo(5));// -> 25
        System.out.println(digitPowTwo(10));// -> 100
        System.out.println(digitPowTwo(4));// -> 16
        rectangle(5, 7);
        unknownNumbers();
        chess(8);
        multiplyTable(10);
    }
    public static void printLineNtimes(String word, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(word + " ");
        }
    }

    public static String printLineNtimesString(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + word + " ";
        }
        return result;
    }

    public static void countdown(int number) {
        for (int i = number; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Start");
    }

    public static int digitPowTwo(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + number;
        }
        return result;
    }

    public static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void unknownNumbers() {
        int result = 36;
        for (int z = 1; z <= result; z++) {
            for (int y = 1; y <= z; y++) {
                for (int x = 1; x <= y; x++) {
                    if (x * y * z == 36 && x <= y && y <= z) {
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }

    public static void chess(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                String place = formatChess(i, j);
                System.out.print(place);
            }
            System.out.println();
        }
    }
    private static String formatChess(int i, int j) {
        String result = "";
        String star = "*";
        String minus = "_";
        if (i % 2 != 0 && j % 2 != 0) {
            result = star;
        } else if (i % 2 == 0 && j % 2 == 0) {
            result = star;
        } else {
            result = minus;
        }
        return result;
    }
    public static void multiplyTable(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                String placeInTable = formatPlaceInTable(i, j);
                //     System.out.print(i * j + " ");
                System.out.print(placeInTable);
            }
            System.out.println();
            //  if (i <= 9) {
            //     System.out.println(" ");
            //    } else {
            //     System.out.println();
        }
    }
    private static String formatPlaceInTable(int i, int j) {
        String result = "";
        int input = i * j;
        if (input < 10) {
            result = "  " + input;
        } else if (input >= 100) {
            result = "" + input;
        } else {
            result = " " + input;
        }
        return result;
    }
}

