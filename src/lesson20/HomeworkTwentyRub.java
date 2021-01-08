package lesson20;

public class HomeworkTwentyRub {
    //Дано два целых положительных числа. Реализовать метод,
    // который для каждого числа от a до b печатает строку вида “23 рубля”.
    // Пример: printSumInRub(1,5) ->
    public static void main(String[] args) {
        printSumInRub(1, 5);
      /*  1 рубль
        2 рубля
        3 рубля
        4 рубля
        5 рублей*/
    }

    private static void printSumInRub(int a, int b) {
        // modulo if else fori
      /*  if (a == 1 && b  < 5) {
            System.out.println(a + " rubl" +" "+ b + " rublya");
        } else if (a > 1 && a < 5 && b < 21) {
            System.out.println(a + " rublya" +" "+ b + " rublei");
        } else if (a > 4 && a < 21) {
            System.out.println(a + " rublei");*/
        for (int i = a; i <= b; i++) {
            //    System.out.println(i);
            if (i > 10 && i < 15) {
                System.out.println(i + " rublei");
            } else if (i % 10 == 1) {
                System.out.println(i + " rubl'");
            } else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4) {
                System.out.println(i + " rublya");
            } else {
                System.out.println(i + " rublei");
            }
        }
    }
}


