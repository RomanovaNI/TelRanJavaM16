package lesson02;

public class HelloInteger {
    public static void main(String[] args) {
        helloLong();
    }

    public static void helloLong() {
        System.out.println("Here is - long");
        long al = 23543245;
        int test = 23543245;
        long bl = 2389473205L;
        long cl = 43_298_472_034L;
        long sum = al + bl;
        System.out.println(sum);

    }

    public static void helloInt() {
        int a = 5;
        int b = 5;
        //int leftButtonUserLogin;
        int c = a + b;
        // definition
        // !!!declaration!!!
        // initialisation
        int x;
        x = 7;
        int d, f, g, h, j, k, l;
        d = x;
        System.out.println(" That's my A " + a);
        System.out.println(c);
    }

}
