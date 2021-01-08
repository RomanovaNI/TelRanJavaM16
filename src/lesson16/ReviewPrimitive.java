package lesson16;

public class ReviewPrimitive {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
        // example();
        //   myRandom();
        // forthMethod();
        //  MyPassword();
        System.out.println(giveMeChar(97, 122));
        System.out.println(giveMeChar('a', 'z'));
        System.out.println(giveMePass(20));
        nTimesPassGenerate (5);


    }

    public static void nTimesPassGenerate(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(giveMePass(10));
        }
    }

    private static String giveMePass(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = giveMeChar(97, 122) + result;
        }
        return result;
    }

    private static String giveMeChar(int min, int max) {
        String result = "";
        char myChar = (char) (Math.random() * (max - min) + 1 + min);
        result = String.valueOf(myChar); // result = or ""+myChar
        return result;

    }


    private static void MyPassword() {
        //create 20 password
        // 1. to make symbol
        //         2.make password
        //          3.repeat 10 times
    }

    private static void forthMethod() {
        char myLovelyChar = (char) (Math.random() * (122 - 97) + 1 + 97);
        String a = "az";
        //  System.out.println(a.codePointAt(0));
        //System.out.println(a.codePointAt(1));
        System.out.println(myLovelyChar);
        int count = 0;
        while (count < 100) {
            char myLovelyCharTest = (char) (Math.random() * (122 - 97) + 1 + 97);
            System.out.print(myLovelyCharTest + " ");
            count++;
        }
        //  for (int i = 0; i < 100; i++) {
        //     char myLovelyCharTest= (char) (Math.random()*(122-97)+1+97);
        //   System.out.print(myLovelyCharTest + " "); }
    }

    private static void myRandom() {
        double magic = Math.random();
        System.out.println(magic);
        //  for (int i = 0; i < 100; i++) {
        //      System.out.println(Math.random());
        //  }
        int normalNumber = (int) (Math.random() * 100);
        System.out.println(normalNumber);

    }

    private static void example() {
        double pi = 3.14;
        int piNew = (int) pi;
        double money = 5.75497593789;
        money = money * 100;
        int newMoney = (int) money;
        System.out.println(newMoney);
        double result = newMoney;
        System.out.println(result);
        // result=result/100;
        result /= 100;
    }

    private static void thirdMethod() {
        int var1 = 54;
        double var2 = var1;
        int var3 = (int) var2;
    }

    private static void secondMethod() {
        float var1 = (float) 45.5;
        float var2 = 45.5f;
        float var3 = 45.5F;
        double var4 = var1;
        float var5 = (float) var4;
    }

    private static void firstMethod() {
        //int, long, short, byte
        //float, double
        //boolean
        //char, String
        byte var1 = 50;
        int var2 = var1;
        byte var3 = (byte) var2;
        long var4 = var2;
        int var5 = (int) var4;
        short varShort = var1;
        byte varByte = (byte) varShort;

    }
}