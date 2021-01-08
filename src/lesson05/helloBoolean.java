package lesson05;

public class helloBoolean {


    public static void main(String[] args) {
        booleanIntro();
        magicGame();
        magicGame2();
        System.out.println(smartDepositBox(true, false));
        System.out.println(smartDepositBox(false, true));
        System.out.println(smartDepositBox(false, false));
        split();
        System.out.println(smartBox2(true, false));
        System.out.println(smartBox2(false, true));
        System.out.println(smartBox2(false, false));
        System.out.println(smartBox2(true, true));
        split2();
        boolean mamaPermission, papaPermission, omaPermission;
        mamaPermission=true;
        papaPermission=false;
        omaPermission=false;
        System.out.println(omaCame(mamaPermission, papaPermission, omaPermission));
        System.out.println(omaCame2(mamaPermission, papaPermission, omaPermission));


    }

    public static void booleanIntro() {
        boolean a = true;
        boolean b = false;
        boolean c = a && b;//I and
        System.out.println(c);
        System.out.println(a || b);// ILI or
        System.out.println(!a);
        boolean d = !a;
        boolean f = a ^ b;//XOR
        System.out.println(f);
    }

    public static void magicGame() {
        int a = 5;
        int b = 10;
        boolean c = a > b;
        System.out.println(c);
        System.out.println(a <= b);
        System.out.println(a >= b);
    }

    public static void magicGame2() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        boolean b = (7 + 8) * 4 != 7 + 4 * 5;
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
        boolean d = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        boolean e = !(3 * 4 < 7 + 8);
        System.out.println(a + "\n" + b + "\n" + c);
    }

    public static boolean smartDepositBox(boolean mama, boolean papa) {
        // smartDepositBox(true, false) -> true
        //smartDepositBox(false, true) -> true
        //smartDepositBox(false, false) -> false
        return mama || papa;
    }

    public static void split() {
        System.out.println("=================");
    }

    public static boolean smartBox2(boolean mama, boolean papa) {

        return mama && papa;
    }

    public static void split2() {

        System.out.println("=================");

             }
        public static boolean omaCame ( boolean mama, boolean papa, boolean oma){
            //(mamaPermission, papaPermission, omaPermission)

            return (mama && papa) || oma;
        }
        public static boolean omaCame2 ( boolean mama, boolean papa, boolean oma){

            return smartBox2(mama, papa)||oma;
        }
    }
