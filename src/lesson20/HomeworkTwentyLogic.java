package lesson20;

public class HomeworkTwentyLogic {
    public static void main(String[] args) {
        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));//→ false
        System.out.println(shareDigit(22, 22));//→ true
        System.out.println(shareDigit(91, 19));//→ true
        System.out.println("==========");
        System.out.println(squirrelPlay(70, false));// → true
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println(squirrelPlay(95, true));// → true
        System.out.println(squirrelPlay(14, true));// → false
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println("========");
        System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(1, true));// → "10:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(3, true));// → "10:00"
        System.out.println(alarmClock(0, false));// → "10:00"
        System.out.println(alarmClock(0, true));// → "off"
        System.out.println(alarmClock(2, true));// → "10:00"
        System.out.println(alarmClock(7, true));// → ""
        System.out.println("========");
        System.out.println(specialEleven(22));// → true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(23));// → true
        System.out.println(specialEleven(24));// → false
        System.out.println("========");
        System.out.println(less20(18)); //→ true
        System.out.println(less20(19)); //→ true
        System.out.println(less20(20));// → false
        System.out.println(less20(38));// → true
        System.out.println(less20(39));// → true
        System.out.println("========");
        System.out.println(answerCell(false, false, false)); //→ true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false
        System.out.println(answerCell(true, true, false));// → true
        System.out.println(answerCell(false, true, false));// → true
        System.out.println(answerCell(true, true, true));// → false
        System.out.println("========");
        System.out.println(fizzString2(1));// → "1!"
        System.out.println(fizzString2(2));// → "2!"
        System.out.println(fizzString2(3));// → "Fizz!"
        System.out.println(fizzString2(5));// → "Buzz!"
        System.out.println(fizzString2(15));// → "FizzBuzz!"
        System.out.println("========");
        System.out.println(inOrderEqual(2, 5, 11, false)); //→ true
        System.out.println(inOrderEqual(5, 7, 6, false));// → false
        System.out.println(inOrderEqual(5, 5, 7, true));// → true
        System.out.println(inOrderEqual(5, 5, 5, true));// → true
        System.out.println(inOrderEqual(5, 5, 5, false));// → false
        System.out.println("========");
        System.out.println(withoutDoubles(2, 3, true));//→ 5
        System.out.println(withoutDoubles(3, 3, true));// → 7
        System.out.println(withoutDoubles(3, 3, false));// → 6
        System.out.println("========");
        System.out.println(greenTicket(1, 2, 3));// → 0
        System.out.println(greenTicket(2, 2, 2));// → 20
        System.out.println(greenTicket(1, 1, 2));//→ 10
        System.out.println(greenTicket(2, 1, 2));//→ 10
        System.out.println("========");
        System.out.println(sumLimit(2, 3));// → 5
        System.out.println(sumLimit(8, 3));// → 8
        System.out.println(sumLimit(8, 1));// → 9
        System.out.println(sumLimit(10, 101));// → 10
        System.out.println(sumLimit(12, 12));// → 24
        System.out.println(sumLimit(12, 1));// → 13

    }

    private static int sumLimit(int a, int b) {
        int sum = a + b;
        String textA = String.valueOf(a);
        //System.out.println(textA.length());
        String textB = String.valueOf(b);
        // String sumAB= String.valueOf(a) + String.valueOf(b);
        //  System.out.println(sumAB.length());*/
        String sumAB = String.valueOf(sum);
        if (sumAB.length() == textA.length()) {
            return a + b;
        } else
            return a;
    }

    private static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }

    }

    private static int withoutDoubles(int roll1, int roll2, boolean noDoubles) {
        if (roll1 == roll2 && noDoubles) {
            return roll1 + roll2 + 1;
        } else {
            return roll1 + roll2;
        }
    }

    private static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return b > a && c > b || equalOk;
    }

    private static String fizzString2(int n) {
        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    private static boolean answerCell(boolean morning, boolean mother, boolean asleep) {
        // return morning==false&&asleep==false||morning==true&&mother==true&&asleep==false;
        return !morning && !asleep || morning && mother && !asleep;
    }

    private static boolean less20(int number) {
        return (number + 1) % 20 == 0 || (number + 2) % 20 == 0;
    }

    private static boolean specialEleven(int number) {
        return number % 11 == 0 || number % 11 == 1;

    }

    private static String alarmClock(int weekDay, boolean vacation) {
        if (weekDay > 0 && vacation && weekDay < 6 && vacation) {
            return "10:00";
        } else if (weekDay == 0 && vacation || weekDay == 6 && vacation) {
            return "off";
        } else if (weekDay > 0 && weekDay < 6) {
            return "07:00";
        } else if (weekDay == 0 || weekDay == 6) {
            return "10:00";
        }
        return "";
    }

    private static boolean squirrelPlay(int degrees, boolean summer) {

        if (degrees >= 60 && degrees <= 90) {
            return true;
        } else if (degrees >= 60 && degrees <= 100 && summer) {
            return true;
        } else
            return false;
    }

    private static boolean shareDigit(int a, int b) {
        int rightDigit1 = a / 10;
        int rightDigit2 = a % 10;
        int leftDigit1 = b / 10;
        int leftDigit2 = b % 10;
        return rightDigit1 == leftDigit1 || rightDigit1 == leftDigit2 || rightDigit2 == leftDigit1 || rightDigit2 == leftDigit2;

    }
}
