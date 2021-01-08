package lesson18;

public class TeacherOfGeometry {
    public static void main(String[] args) {
        double money = ammountOfSpraycan() * 17;
        System.out.println(money + " €");
    }

    private static double ammountOfSpraycan() {
        double result = colorAmount() / 400;
        //result=Math.floor(result); // okrugli vniz
        result = Math.ceil(result); // okrugli vverx
        System.out.println("Amount of ballon " + result);
        return result;
    }

    private static double colorAmount() {
        double result = giveMeArea() * 560 / 10000 ;
        return result;


    }

    private static double giveMeArea() {
        double result = sphereArea() + cubeArea() + pyramidArea() + boxArea();
        return result;
    }

    private static double boxArea() {
        int a = 80;
        int b = 30;
        int c = 20;
        return 2 * a * b + 2 * b * c + 2 * a * c;
    }

    private static double pyramidArea() {
        int a = 20;
        int b = 30;
        return a * a + 2 * a * Math.sqrt(b * b - a * a / 4);
    }

    private static double cubeArea() {
        int a = 40;
        return a * a + 6;
    }

    private static double sphereArea() {
        int radius = 58 / 2;
        double result = Math.PI * radius * radius * 4;
        return result;
    }

}
