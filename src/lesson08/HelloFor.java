package lesson08;

public class HelloFor {
    public static void main(String[] args) {
        myWeek();
    }
    public static void myWeek() {
        int weekDays = 7;
        //nachalo
        //yslovie
        //shag
        for (int i = 0; i <= weekDays; i++) {
            System.out.println("=======");
            System.out.println("I wake up at 7");
            System.out.println("I eat breakfast");
            System.out.println("I go to IT courses");
            System.out.println("I come back home");
            System.out.println("I play with daughter");
            System.out.println("I eat dinner");
            System.out.println("I look Instagram");
            System.out.println("I go to bed");
            System.out.println("==========");
            System.out.println(i);
        }
    }
}


