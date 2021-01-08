package lesson17;


public class Converter {
    public static void main(String[] args) {
        System.out.println(coverterDecimalToBinaryWhile(78));
        System.out.println(coverterDecimalToBinaryFor(78));
    }

    public static String coverterDecimalToBinaryWhile(int decimal) {
        String output = "";
        while (decimal > 0) {
            int remainder = decimal % 2; //78%2=0
            output = remainder + output; //0
            decimal = decimal / 2;//78/2=39
        }
        return output;
    }

    public static String coverterDecimalToBinaryFor(int decimal) {
        String output = "";
        for (int i = decimal; i > 0; i = i / 2) {
            int remainder = i % 2; //78%2=0
            output = remainder + output; //0
        }
        return output;
    }
}
