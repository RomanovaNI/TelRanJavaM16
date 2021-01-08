package lesson09;

public class PractiseString {
    public static void main(String[] args) {
       System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Tel Ran"));
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
        System.out.println(firstHalf("WooHoo"));
       System.out.println(firstHalf("HelloThere"));
       System.out.println(firstHalf("abcdef"));
       System.out.println(nonStart("Hello", "There"));// → "ellohere"
       System.out.println(nonStart("java", "code")); //→ "avaode"
        System.out.println(nonStart("shotl", "java"));//→ "hotlava"
       System.out.println(nonStart("Telran", ""));//→ error
        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"
    }

    public static String helloName(String name) {
        String result = "Hello " + name + '!';
        return result;
    }

    public static String makeOutWord(String out, String word) {
        String result = out.substring(0, 2) + word + out.substring(2);
        return result;
    }

    public static String firstHalf(String input) {
        int half = input.length() / 2;
        return input.substring(0, half);
    }

    public static String nonStart(String str1, String str2) {
        return str1.substring(1) + str2.substring(1);
    }

    private static String theEnd(String word, boolean b) {
        String output = "";
        if (b) {//b==true;
            //  return word.substring(0,1);
            output = word.substring(0, 1);
        } else {
            // return word.substring(word.length()-1);
            output = word.substring(word.length() - 1);
        }
        return output;
    }

}


