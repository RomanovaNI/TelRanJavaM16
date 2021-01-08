package lesson02;

public class HelloIntegerTwo {
    public static void main(String[] args) {
        helloInt();
        helloByte();
        helloShort();

    }

    public static void helloInt() {
        int a = 6;
        System.out.println("wait six " + a);
        int b = 3;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);

    }

    public static void helloByte() {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        byte d = 120;
        byte f = 10;
        byte e = (byte) (d + f);// mistake
        System.out.println(e);
    }

    public static void helloShort() {
        short a = 23_43_2;
        short b = 2423;
        short c = (short) (a + b);


    }

    public static void magicNumber() {
        int hexValue = 0x100;
        int binary = 0B1001_1001;
        int octal = 0757;
    }
}

