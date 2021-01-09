package lesson25;

public class HomeworkTwentyFive {
    public static void main(String[] args) {
        System.out.println("The largest digit between 15 and 5 is " + getMeMax(15, 5));// → 15
        System.out.println("The largest digit between 4 and 16 is " + getMeMax(4, 16));// → 16
        System.out.println("The largest digit between 20 and 100 is " + getMeMax(20, 100));// → 100
        System.out.println("=====");
        System.out.println("The smallest digit between 15 and 45 is " + getMeMin(15, 45));// → 15
        System.out.println("The smallest digit between 44 and 16 is " + getMeMin(44, 16));// → 16
        System.out.println("The smallest digit between 200 and 100 is " + getMeMin(200, 100));// → 100
        System.out.println("=====");
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"
        whileTraining(3, 5);
        doWhileTraining(5,17);
    }

    private static String myFirstCompareTo(String city1, String city2) {
        String result = "";
        result = city1.charAt(0) > city2.charAt(0) ? city2 : city1; ///Vopros po Minsk & Moscow
        return result;
    }
    private static int getMeMin(int a, int b) {
        int result = 0;
        result = a < b ? a : b;
        return result;
    }

    private static int getMeMax(int a, int b) {
        int result = 0;
        result = a > b ? a : b;
        return result;
    }

    public static void whileTraining(int a, int b) {
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        int count = 0;
        while (count < b) {
            count++;
            System.out.println(a);
        }
    }

    public static void doWhileTraining(int a, int b) {
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        do {
            System.out.print(a + " ");
            a++;
        }
        while (a <= b);
    }
}