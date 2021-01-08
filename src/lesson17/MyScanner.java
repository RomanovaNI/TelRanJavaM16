package lesson17;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        Scanner magicInput = new Scanner(System.in);
        int age;
        System.out.println("How old are you?: ");
        age = magicInput.nextInt();
        System.out.println("What is your name?:  ");
        String customerName;
        customerName = magicInput.next();
        System.out.println("Are you sure? " + customerName + " that you are " + age + " years old");
    }
}
