package lesson18;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        game();
    }

    public static void game() {

        int range = customerRange();
        int attempts = range / 20;//popitka

        int secretComputerNumber;
        int customerNumber;
    }

    private static int customerRange() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Diapazon chisla");
        return scr.nextInt();
    }
}
