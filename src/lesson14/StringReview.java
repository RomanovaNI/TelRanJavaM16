package lesson14;

public class StringReview {


    public static void main(String[] args) {
        String hm = "Vasiliy";
        String testString = hm.substring(1);
        System.out.println(testString);
        System.out.println(hm.substring(1));
        hm = hm.substring(1);
        System.out.println(hm);
        hm = hm.substring(1);
        System.out.println(hm);
    }
}