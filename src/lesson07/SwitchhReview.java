package lesson07;

public class SwitchhReview {
    public static void main(String[] args) {
        String uncle = "uncle Sasha";
        int floor = 19;
        System.out.println("Hello, your are on the " +elevator(floor));

    }

    public static String elevator(int level) {
        String result = "";
        switch (level) {
            case 9:
                result = "Ninth floor";
                break;
            case 8:
                result = "Eighth floor";
                break;
            case 7:
                result = "Seventh floor";
                break;
            case 6:
                result = "Sixth floor";
                break;
            case 5:
                result = "Fivth floor";
                break;
            case 4:
                result = "Fourth floor";
                break;
            case 3:
                result = "Third floor";
                break;
            case 2:
                result = "Second floor";
                break;
            case 1:
                result = "First floor";
                break;
            case 0:
                result = "Zero floor";
                break;
            case -1:
                result = "Minus first floor";
                break;
            default:
                result = "does not exist";
        }
        System.out.println("Hello, your are on the " + result);
        return result;
    }
}
