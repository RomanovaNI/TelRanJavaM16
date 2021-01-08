package lesson14;

public class DigitGame {
    public static void main(String[] args) {
        //456;->
        //4+5+6=15
        System.out.println(myMagicSum(456));
    }

    private static int myMagicSum(int number) {
        String input = String.valueOf(number);
        int size = input.length();
        int result = 0;
        for (int i = 0; i < size; i++) {
            int temp = Integer.parseInt(input.substring(0, 1));
            result=result+temp;
            input=input.substring(1);
        }
        return result;
    }

    private static int myMagicSumUno(int number) {
        return 0;
    }
}
