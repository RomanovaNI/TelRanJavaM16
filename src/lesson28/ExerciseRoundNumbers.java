package lesson28;

public class ExerciseRoundNumbers {
    public static void main(String[] args) {
        naturalNumbers(1, 10);
        naturalNumbers(5, 45);
    }

    private static void naturalNumbers(int a, int b) {
        for (int i = a; i < b; i++) {
            // if (i % i == 0)
            if (primeNumber(i)) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    private static boolean primeNumber(int number) {
        if (number == 0) {
            return false;
        }
        if (number == 1) {
            return true;
        }
        int count = 0; //var1
        // boolean flag = false; //var2
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                //  flag = true;
            }
        }
        if (count > 0) {
            return false;
        }
        //   if (flag) {
        //      return false;
        //   }
        return true;
    }
}
