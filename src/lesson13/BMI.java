package lesson13;

public class BMI {
    public static void main(String[] args) {
        double weight = 100.2;
        double high = 1.75; //v metrah
        System.out.println(findBMI(weight, high));
        System.out.println(findBMI(60, 1.65));
        double weightCustomer1=80;
        double highCustomer1=2;
        System.out.println(findBMI(weightCustomer1, highCustomer1));
    }

    private static double findBMI(double weight, double high) {
        return weight / (high * high);
    }
}
