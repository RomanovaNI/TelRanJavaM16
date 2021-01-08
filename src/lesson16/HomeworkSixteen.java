package lesson16;

public class HomeworkSixteen {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
        System.out.println(makeBricks(10, 2, 10));// → true
        System.out.println(makeBricks(3, 1, 10));// → false
        System.out.println(makeBricks(3, 2, 9));// → false
        System.out.println(makeBricks(1, 4, 12));// → false
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        multiplicationTable(3);
        printDivisors(32);
    }

    private static void printDivisors(int number) {
        int divisors = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                divisors++;
                System.out.println(i);
            }
        }
    }

    private static void multiplicationTable(int digit) {
        int result = 0;
        //int x= digit;
        for (int i = 1; i <= 10; i++) {
            result = digit * i;
            System.out.println(digit + "x" + i + "=" + result);

        }


    }



    private static String doubleChar(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result = result + word.charAt(i) + word.charAt(i);

        }

        return result;
    }

    private static boolean makeBricks(int smallBrick, int bigBrick, int goal) {

        return smallBrick + bigBrick * 5 == goal || smallBrick == goal || bigBrick * 5 == goal;
     /*   if (goal > smallBrick + bigBrick*5) {
            return false;
        } else {
            return true;
        }*/
    }
}


