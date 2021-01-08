package lesson09;

public class PracstiseBoolean2 {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(11, 10));// → false
        System.out.println(love6(11, 5));// → true
    }

    private static boolean love6(int a, int b) {
        //  int def = Math.abs(a - b);
        // return a == 6 || b == 6 || (a + b) == 6 ||def==6;
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (Math.abs(a - b) == 6) {
            return true;
        } else {
            return false;
        }
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }
        int output;
        if (speed <= 60) {
            output = 0;
        } else if (speed <= 80) {
            output = 1;
        } else {
            output = 2;
        }
        return output;
    }
}




