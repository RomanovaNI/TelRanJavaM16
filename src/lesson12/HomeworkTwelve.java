package lesson12;

public class HomeworkTwelve {
    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 4, true));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
        System.out.println(inOrder(0, 0, 0, true));// → false
        split2();
        System.out.println("Less by 10: " + lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true
        System.out.println(lessBy10(12, 7, 7));// → false
        System.out.println(lessBy10(18, 1, 7));// → true
        split2();
        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
        System.out.println(theEnd("tree", true));// → "t"
        System.out.println(theEnd("treE", false));// → "e"
        split2();
        System.out.println("endsLy " + endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false
        System.out.println(endsLy("Friendly"));// → true
        System.out.println(endsLy("Love"));// → false
        split2();
        System.out.println(middleThree("Candy"));// → "and"
        System.out.println(middleThree("and")); //→ "and"
        System.out.println(middleThree("solving"));// → "lvi"
    }

    private static String middleThree(String word) {
        int middle=word.length()/2;

        return word.substring(middle-1, middle+2);


    }

    private static boolean endsLy(String word) {

        return word.endsWith("ly");
    }

    private static String theEnd(String word, boolean front) {
        if (front) {
            return word.substring(0, 1);
        } else {
            return word.substring(word.length() - 1);
        }
    }

    private static boolean lessBy10(int a, int b, int c) {
        if (a <=b-10||a<=c-10){
            return true;
        }else if (b <=a-10||b<=c-10){
            return true;
        }else if ( c<=a-10||c<=b-10) {
            return true;
        }
        return false;

      //  return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 ||Math.abs(c-a) >= 10
    }

    public static void split2() {
        System.out.println("============");
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {

        return a < b && b < c ||  b < c && bOk;

    }
}
