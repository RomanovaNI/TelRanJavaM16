package lesson18;

public class HomeworkEighteen {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));// → "loHi"
        System.out.println(minCat("Hello", "java"));// → "ellojava"
        System.out.println(minCat("java", "Hello"));// → "javaello"
        System.out.println(deFront("Hello")); //llo
        System.out.println(deFront("java"));//va
        System.out.println(deFront("away"));//aay
        System.out.println(deFront("ebay"));//bay
        System.out.println(deFront("abuse"));//abuse
        System.out.println(deFront("table"));//ble
        System.out.println(withoutX2("xHi"));// → "Hi"
        System.out.println(withoutX2("Hxi"));// → "Hi"
        System.out.println(withoutX2("Hi"));// → "Hi"
        System.out.println(withoutX2("xxHi"));// → "Hi"
        System.out.println(withoutX2("xx"));// → ""
    }

    private static String withoutX2(String word) {

        if (word.charAt(0) == 'x' && word.charAt(1) == 'x') {
            return word.substring(2);
        } else if (word.startsWith("x")) {
            return word.substring(1);
        } else if (word.charAt(1) == 'x') {
            return word.substring(0, 1) + word.substring(2);
        } else {
            return word;
        }
    }

    private static String deFront(String str) {
        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str.substring(0);
        } else if (str.charAt(1) == 'b') {
            return str.substring(1);
        } else if (str.charAt(0) == 'a') {
            return str.substring(0, 1) + str.substring(2);
        } else {
            return str.substring(2);
        }
    }

    private static String minCat(String str1, String str2) {
        String result = " ";
        int min = str1.length() - str2.length();
        int min2 = str2.length() - str1.length();
        if (str1.length() > str2.length()) {
            return str1.substring(0, str2.length()) + str2;
        } else if (str2.length() > str1.length()) {
            return str1 + str2.substring(0, str1.length());
        } else {
            return str1 + str2;
        }


    }

}
