package lesson08;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

public class ForExample {
    public static void main(String[] args) {
        example01();
        example02();
        example03();
    }

    private static void example01() {
        int a = 3;
        for (int i = 0; i < 10; i++) {//10 krugov s shagom odin
            a++;
        }
        System.out.println(a);
    }

    private static void example02() {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        int a = 10;
        int b = 20;
        for (int i = 0; i < b; i++) {
            System.out.print(a+" ");

        }
        System.out.println("========");
    }
    public static void example03(){
       //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        int a=5;
        int b=17;
        for (int i = a; i <b ; i++) {
            System.out.print(i+"  ");

        }
    }
}


