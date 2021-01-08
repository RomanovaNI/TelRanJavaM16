package lesson04;

public class HelloChar {
    //simnols
    public static void main(String[] args) {
        char digitalNu=100;
        System.out.println(digitalNu);
        char octal = '\u309A';
        System.out.println(octal);
        char octal2 ='\u264F';
        System.out.println(octal2);
        char euroSymbol = '€';
        System.out.println(euroSymbol);
        char tabulator ='\t';
        System.out.print(tabulator);
        System.out.println("waiting 4 spaces");
        System.out.println(('a'+'b'+'c'));
        System.out.println((""+'a'+'b'+'c'));
    }
}
