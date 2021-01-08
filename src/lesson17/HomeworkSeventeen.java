package lesson17;

import java.util.Scanner;

public class HomeworkSeventeen {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String customerName = input.next();
        System.out.println("What is your last name?");
        String customerLastName = input.next();
        System.out.println("What is your gender?");
        String customerGender = input.next();
        System.out.println("What is your email address?");
        String customerEmail = input.next();
        System.out.println("Income information:" + "\n" + customerName + " " +
                customerLastName + "\n" + customerGender + "\n" + customerEmail);
        input.close();
        Scanner inPut = new Scanner(System.in);
        System.out.println("What is your age?");
        String age = inPut.next();
        System.out.println("Your age is: " + age);
        age = String.valueOf(age);
        int ageInt = Integer.parseInt(age);
        System.out.println(ageInt);
        inPut.close();
    }
}
