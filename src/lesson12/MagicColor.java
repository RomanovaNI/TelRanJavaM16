package lesson12;

public class MagicColor {
    public static void main(String[] args) {
        myColorPrintTwo();
    }

    private static void myColorPrintTwo() {
        final String ANSI_RESET =  "\u001B[0m";
        final String ANSI_BLACK = "\u001B[3Om";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m"; // "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        System.out.println(ANSI_BLUE + "Hello World" + ANSI_RESET);
        System.out.println(ANSI_RESET);

        final String ANSI_BlACK_BACKGROUND = "\u001B[4Om";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
        System.out.println(ANSI_GREEN_BACKGROUND + "THIS TEXT HAS A GREEN BACKGROUND" + ANSI_RESET);
        System.out.println(ANSI_RED + ANSI_YELLOW_BACKGROUND+"THIS TEXT HAS A DEFAULT BACKGROUND BY RED TEXT" + ANSI_RESET);


    }
}
