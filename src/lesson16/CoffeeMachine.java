package lesson16;

public class CoffeeMachine {
    public static void hotWatter(int ml) {
        System.out.printf("Added %d ml of water \n", ml);
    }
    public static void cappuccino() {
        milk(30);
        hotWatter(20);
        coffee(40);
        System.out.println("Cappiccino is ready");
        System.out.println("------");
    }

    public static void latte() {
        milk(40);
        hotWatter(70);
        coffee(30);
        System.out.println("Latte is ready");
        System.out.println("------");

    }

    public static void americano() {
        System.out.println("Americano is ready");
        hotWatter(0);
        hotWatter(100);
        coffee(20);
        System.out.println("------");
    }

    private static void coffee(int mg) {
        System.out.printf("Added %d mg of coffee \n", mg);
    }

    private static void milk(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);
    }

    public static void main(String[] args) {

        americano();
        latte();
        cappuccino();

    }
}
