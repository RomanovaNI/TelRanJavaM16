package lesson15;

public class LoopForExercise {
    // for i/while/do while
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }
        return result;
    }
    public static int multiply2(int a, int b) {
        int result = 0;
        int count = 0;
        while (count < b) {
            result = result + a;
            count++;
        }
        return result;
    }
    public static int multiply3(int a, int b) {
        int result = 0;
        int count = 0;
        do {
            result = result + a;
            count++;
        } while (count < b) ;
        return result;
}
    public static void myInt() {
        int c = 6;
        c = c + 7;
        c = c + 9;
    }
    public static void draw() {


    }

}
