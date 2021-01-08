package lesson15;

public class HomeworkFifteenWhile {
    public static void main(String[] args) {
        //  System.out.println(printLineNTimes("hello", 3));
        // System.out.println(printLineNTimes("Lockdown", 5));
        countdown(5); //-> 5 4 3 2 1 start
        System.out.println(digitPowTwo(5));
        System.out.println(digitPowTwo(10));
        System.out.println(digitPowTwo(4));
        rectangle(5, 7);
        chess(8);
      //  unknownNumbers();
    }

   /* public static void unknownNumbers() { //doesnt work
        int result = 36;
        int z = 1;
        while (z <= result) {
            z++;
            int y = 1;
            while (y <= z) {
                z++;
                int x = 1;
                while (x <= y) {
                    x++;
                }
                if (x * y * z == 36 && x <= y && y <= z) {
                    System.out.println(x + " " + y + " " + z);
                }
            }
        }
    }*/

    private static void chess(int line) {
        int vertical = 0;
        while (vertical < line) {
            vertical++;
            int horizontal = 0;
            while (horizontal < line / 2) {
                horizontal++;
                System.out.print("* _");

            }
            System.out.println();
        }
    }

    private static void rectangle(int a, int b) {
        int vertical = 0;
        while (vertical < a) {
            vertical++;
            int horizontal = 0;
            while (horizontal < b) {
                horizontal++;
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static int digitPowTwo(int number) {
        int result = 0;
        int count = 0;
        while (count < number) {
            count++;
            result = result + number;
        }
        return result;

    }

    private static void countdown(int number) {
        int count = number;
        while (count > 0) {

            System.out.print(count + " ");
            count--;
        }
        System.out.println("Start");
    }

    private static String printLineNTimes(String word, int n) {
        String result = " ";
        int count = 0;
        while (count < n) {
            count++;
            //  System.out.print(word + " ");
            result = result + word + " ";
        }
        return result;
    }
}