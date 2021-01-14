package lesson29;


public class Palindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
        System.out.println(checkPalindrom("Анисина"));// -> true
        System.out.println(checkPalindrom("поп"));// -> true
        System.out.println(checkPalindrom("школа"));// -> false
        //  System.out.println(reverse("А роза упала на лапу Азора"));
        //System.out.println(stringWithoutSpace("А роза упала на лапу Азора"));
        //  System.out.println(stringWithoutSpace("Анисина"));
        // System.out.println(toLowerCase("А роза упала на лапу Азора"));
        //    System.out.println(toLowerCase("Анисина"));

        // "А роза упал на лапу Азора" - >>
        // "pop"  - true
        // "JavaScript"  - > false
        // Решение
        // 1. Привести к одному регистру  // туловер
        // 2. Убрать пробелы. // сложновато, надо писать отельный метод
        // 3. Перевернуть слово или всю фразу / стринг  // есть такой метод
        // 4. Сравнить инпут с аутпутом // equals
        // 5. Вернуть сравнение // return
    }

    private static boolean checkPalindrom(String input) {
        input = stringWithoutSpace(input);
        return input.equals(reverse(input));
    }

    private static String reverse(String input) {
        input = stringWithoutSpace(input);
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        return output;
    }

    private static String stringWithoutSpace(String input) {
        input = toLowerCase(input);
        String output = "";
        char space = ' ';

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != space) {
                output = output + input.charAt(i);
            }
        }
        return output;

    }
    private static String toLowerCase(String input) {
        String output = input.toLowerCase();
        return output;
    }

}






