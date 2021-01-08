package lesson17;

import java.util.Scanner;

public class MySecondGame {
    public static void main(String[] args) {
        //1.Computer generates one digit
        //2.Business logic of the game
        //3.add Scanner
        //4.
        // System.out.println(generateDigit());
   //     game();
    }
    private static void game() {
        Scanner input = new Scanner(System.in);
        int digit = generateDigit();
        System.out.println("Say the number from 0 to 100");
        int number = input.nextInt();
        System.out.println(compareNumbers(number, digit));
        while (number!=digit){
             number = input.nextInt();
            System.out.println(compareNumbers(number, digit));
        }
        System.out.println("AAAA");
    }

    private static String compareNumbers(int number, int digit) {
        if (number == digit) {
            return "bingo";
        } else if (number > digit) {
            return "number>digit";
        } else {
            return "number<digit";
        }
    }
    public static int generateDigit() {
        return (int) (Math.random() * 100);
        //(max-min)+1+min
    }
}
