package lesson04;

public class HomeworkFour {
    public static void main(String[] args) {
        String firstExample = helloName05("Bob");// "Hello Bob!"
        System.out.println(firstExample);
        helloName05("Alice");// "Hello Alice!"
        System.out.println(helloName05("Alice"));
        helloName05("X");// "Hello X!";
        System.out.println(helloName05("X"));
        exercise01();
        exercise02NameAndProfession();
        System.out.println(exercise03FormUserName("User name: " + "Natalia"));
        //1. Kak propisat postrochno, ne plodya metodi???; 2. why i cant print only Natalia
        System.out.println(exercise03FormUserLastName("User last name: " + "Romanova"));
        exercise03Option2();
        System.out.println(exercise04Transformation());
        makeOutWord("<<>>", "Yay");


    }

    public static void exercise01() {
        char scorpio = '\u264F';
        System.out.println("Symbol of scorpio is " + scorpio);
        char rub = '\u20BD';
        System.out.println("Symbol of rouble is " + rub);
        char copyright = '\u00A9';
        System.out.println("Symbol of copy righht is " + copyright);
        char smile = '\u263A';
        System.out.println("Symbol of smile is " + smile);
        char telephone = '\u260E';
        System.out.println("Symbol of telephone is " + telephone);
        char paragraph = '\u00A7';
        System.out.println("Symbol of paragraph  is " + paragraph);
        char trademark = '\u0099';
        System.out.println("Symbol of trademark  is " + trademark);
        //trademark doesn't print
        char euro = '\u0080';
        System.out.println("Symbol of euro  is " + euro);
        char dollar = '\u0024';
        System.out.println("Symbol of dollar  is " + dollar);
        char chessFigure1 = '\u265C';
        char chessFigure2 = '\u265A';
        System.out.println("Symbol of chess figures  are " + chessFigure1 + ";" + chessFigure2);


    }

    public static void exercise02NameAndProfession() {
        String myName = "Romanova Natalia";
        String profession = " \"Quality assurance manage\"";
        String user = myName + profession;
        System.out.println(user);
        // do we need in such method "return" and is it possible to sign "(dvoinye skobki) not '(a ne odinarnye) for profession
    }

    public static String exercise03FormUserName(String userName) {

        String result = userName;
        return result;
    }

    public static String exercise03FormUserLastName(String userLastName) {

        String result = userLastName;
        return result;
    }

    public static void exercise03Option2() {
        String userName = "Natlaia";
        System.out.println("user Name: " + userName);
        String lastName = "Romanova";
        System.out.println("user last name: " + lastName);
        // but i think this method is not correct because its no return
    }

    public static String exercise04Transformation() {
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        String firstSymbol = "<<";
        String yay = "Yay";
        String lastSymbol = ">>";
        String result = firstSymbol + yay + lastSymbol;
        return result;
        // i didnt undestand the task and why we need to write char myLastSymbol = '...' like in ex05;
    }

    public static String exercise04TransformationSchool() {
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        String firstSymbol = "<<";
        String yay = "Yay";
        String lastSymbol = ">>";
        String result = firstSymbol + yay + lastSymbol;
        return result;
        // i didnt undestand the task and why we need to write char myLastSymbol = '...' like in ex05;

    }

    public static String makeOutWord(String out, String word) {

        String result = "";
        result = out.substring(0, 2) + word + out.substring(2);
        return result;
    }

    public static String helloName05(String name) {
        String hello = "Hello ";
        String lastSymbol = "!";
        char myLastSymbol = '!';
        String result = hello + name + " " + lastSymbol;
        return result;
        //return "Hello "+name+"!";
    }
}
