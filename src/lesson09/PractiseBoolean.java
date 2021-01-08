package lesson09;

public class PractiseBoolean {
    public static void main(String[] args) {
        System.out.println(cigarPartyOne(30, false)); //→ false
        System.out.println(cigarPartyOne(50, false)); //→ true
        System.out.println(cigarPartyOne(70, true));// → true
        System.out.println(cigarPartyTwo(30, true));
        System.out.println(cigarPartyThree(75, true));

    }

    private static boolean cigarPartyOne(int cigars, boolean weekend) {
        if (cigars < 40) {
            return false;
        } else if (cigars <= 60 && !weekend) {
            return true;
        } else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean cigarPartyTwo(int cigars, boolean weekend) {
        if (cigars > 40 && cigars < 60 && weekend) {
            return true;
        } else if (cigars > 60 && weekend) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean cigarPartyThree(int cigars, boolean weekend){
        return (cigars>40&&cigars<60&&!weekend)||(cigars>60&&weekend);
    }
}





