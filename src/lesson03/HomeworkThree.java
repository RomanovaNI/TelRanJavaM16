package lesson03;

public class HomeworkThree {


    public static void main(String[] args) {
        double result = exercise01ProgrammingCircleSquare(10);
        System.out.println("Circle Square: " + result);
        exercise02Length();
        System.out.println("For 5 dollars you get: " + exercise03EuroPrice(5) + " euro");
        double myRelation = exercise04();
        System.out.println(myRelation);
        System.out.println(exercise04AnotherTime(4567, 5974));
        System.out.println("Moscow is in " + exercise05MoscowBerlin(2561.0, 891.0) + " times bigger");
        System.out.println("Your win in 7 years is " + exercise06WinIn7Years(1000, 7) + " euro");


    }

    public static double exercise01ProgrammingCircleSquare(int radius) {
//S= PI * radius * radius
        double javaPi = Math.PI;

        double circleSquare = javaPi * radius * radius;
        return circleSquare;
    }

    public static void ex1School() {
        double pi = 3.14;
        double rad = 15.5;
        double area = pi * rad * rad;

    }

    public static void exercise02Length() {
        //P=2PIr
        final double PI = 3.14;
        int radius = 10;
        double lenghthCircle = 2 * PI + radius;
        System.out.println("Length is: " + lenghthCircle);

    }

    public static double exercise03EuroPrice(double dollars) {
        double euroPrice = dollars / 1.1;
        return euroPrice;
    }

    public static double exercise04AnotherTime(double firstArea, double secondArea) {
        double areaRelation = firstArea / secondArea;
        return areaRelation;
    }

    public static double exercise04() {
        // Найти соотношение площади Беларуси к площади Украины
        //Bel- 207,595 km2
        //U- 603,628 km2
        double belArea = 207.595;
        double ukrArea = 603.628;
        double relation = belArea / ukrArea;
        //  System.out.println("соотношение площади Беларуси к площади Украины " + relation);
        return relation;
    }

    public static double exercise05MoscowBerlin(double moscow, double berlin) {
        //Moscow - 2561,0 ;
        //Berlin-891,0
        double result = moscow / berlin;
        return result;
    }

    public static double exercise06WinIn7Years(double money, int years) {
        //Start -1000 euro
        // 3,5% annual
        // Lasting - 7 years
        //double money = 1000;
        double rate = 3.5 / 100;
        //  double years = 7;
        double win = money * rate * years;
        return win;
    }
}

