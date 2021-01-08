package lesson16;

public class CoffeeVendingStarter {
    public static void main(String[] args) {
        myChoise(5);
    }

    private static void myChoise(int customerChoice) {
        switch (customerChoice){
            case 3:
                CoffeeMachine.latte();
                break;
            case 1:
                CoffeeMachine.americano();
                break;
            case 2:
                CoffeeMachine.cappuccino();
                break;
            case 4:
                CoffeeMachine.hotWatter(100);
                break;
            default:
                System.out.println(" not possible");
                break;
        }
    }
}
