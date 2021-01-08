package lesson06;

public class HelloSwitch {

    /*Za pyterky po kontrolnoi Java - bicycle;
    Za chetverky- goPro
    Za troiky - ne porygaut
    Za dvoiky-otrygaut
    Za edinicy "kick"
     */

    public static void main(String[] args) {
        int mark = 1;
        int score = 3;

        //myFirstSwitch(mark);
        //myFirstSwitch(score);
        myFirstSwitch(5);
        System.out.println(myFirstSwitch(4));
    }

    public static String myFirstSwitch(int schoolScore) {
        String prize = "";
        //operator vibora, kluchhevoe slovo, konstrukt
        switch (schoolScore) {
            case 1:
                prize = "kick";
                break;
            case 2:
                prize="otrygaut";
                break;
            case 3:
                prize="ne porygaut";
                break;
            case 4:
                prize="goPro";
              break;
            case 5:
                prize="bicycle";
                break;
            default:
                prize="mission impossible";
                break;
        }
        System.out.println(prize);
        return prize;
    }

}
