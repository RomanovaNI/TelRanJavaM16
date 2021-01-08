package lesson03;

public class Calculator {
    public static void main(String[] args) {
        additionTwo(5, 8);
        additionTwo(130, 150);
        additionThree(130, 12);
        int x=100;
        int y=200;
        additionTwo(x,y);
        int test1=45;
        test(test1, 56);
    }
    public static void test(double a, double b){

    }
    public static void additionThree(int weight, int height) {
        int c = weight + height;
        System.out.println(c);
    }

    public static void additionTwo(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void additionOne() {
        int a = 3;
        int b = 5;
        int additionOne = a + b;
        System.out.println(additionOne);


    }
}
