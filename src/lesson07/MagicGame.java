package lesson07;

public class MagicGame {
    public static void main(String[] args) {
        type1();
        type2();
        type3();

    }

    public static void type1() {
        int a = 5;
        int b = 8;
        // code
        int temp = a;
        a = b;
        b = temp;
    }

    public static void type2() {
        int a = 5;
        int b = 8;
       a=a+b;//13
       b=a-b;//13-8
       a=a-b;//13-5
        System.out.println(a);
        System.out.println(b);
    }
    public static void type3() {
        int a = 5;
        int b = 8;
        a=a+b - (b=a);
        System.out.println(a);
        System.out.println(b);
    }

}
