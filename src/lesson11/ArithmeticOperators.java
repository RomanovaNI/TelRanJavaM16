package lesson11;

public class ArithmeticOperators {

    public static void main(String[] args) {
        intoOne();
    }
    private static void intoOne() {
        int a = 5;
        a = a + 1;
        a++;
        a += 1;// a=a+1;
        System.out.println(a);
        int b = 4;
        a *= b; //a=a*b;
        System.out.println(a);
        a%=b;
        System.out.println(a);
    }

}