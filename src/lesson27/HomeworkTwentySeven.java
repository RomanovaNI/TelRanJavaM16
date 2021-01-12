package lesson27;

public class HomeworkTwentySeven {
    public static void main(String[] args) {
        //Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
        System.out.println(blackjack(19, 21));// →21
        System.out.println(blackjack(21, 19));// →21
        System.out.println(blackjack(19, 22));// →19
        System.out.println(blackjack(22, 22));// →0
        System.out.println(blackjack(22, 19));// →19
        System.out.println(blackjack(20, 20));// →20
        System.out.println("============");
//Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not
//count towards the sum.
        System.out.println(loneSum(1, 2, 3));// →6
        System.out.println(loneSum(3, 2, 3));// →2
        System.out.println(loneSum(3, 3, 3));// →0
        System.out.println("===========");
        //Return a version of the given string, where for every star () in the string the star and
        // the chars immediately to its left and right are gone. So "abcd" yields "ad" and "ab**cd" also yields "ad".
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
        System.out.println("==========");
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
    }

    private static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++;
            }
        }
        return count;
    }

    private static String starOut(String input) {
        char star = '*';
        //   String doubleStar="**";
        String output = "";
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == star && input.charAt(i + 1) == star) {
                return input.substring(0, i - 1) + input.substring(i + 3);
            } else if (input.charAt(i) == star) {
                return input.substring(0, i - 1) + input.substring(i + 2);
            }
        }
        return output;
    }

    private static int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }
        return a + b + c;
    }

    private static int blackjack(int a, int b) {
        int magicNumber = 21;
        if (a > magicNumber && b > magicNumber) {
            return 0;
        }
        if (a > magicNumber) {
            return b;
        }
        if (b > magicNumber) {
            return a;
        }
        if (a - b > 0) {
            return a;
        } else if (b - a > 0) {

        }

        return b;
    }

}
