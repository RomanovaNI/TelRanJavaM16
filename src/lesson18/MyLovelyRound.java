package lesson18;

public class MyLovelyRound {
    public static void main(String[] args) {
       roundIntro();
      //  roundIntro2();
        roundIntro3();
        roundIntro4();

    }

    private static void roundIntro4() {
        //okryglit vniz
        double number =3.9;
        int newNumber= (int) number;
        System.out.println(newNumber);
    }

    private static void roundIntro3() {
        //okryglit vverx
        double inputnumber = 3.141;
        int temp= (int) inputnumber;
        double temp2=temp;
        System.out.println(temp2);
        if (inputnumber>temp2) {
            inputnumber=temp2+1;
        }
        System.out.println(inputnumber);
    }

    private static void roundIntro2() {
        double number = 3.141;
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }

    private static void roundIntro() {
        double pi = Math.PI;
        // 3 digits posle zapyatoi
        double tempPi = pi * 1000;
        System.out.println(tempPi);
        int magicInt = (int) tempPi;
        System.out.println(magicInt);
        pi = (double) magicInt / 1000;
        System.out.println(pi);
    }
}
