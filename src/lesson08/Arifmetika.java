package lesson08;

import sun.management.snmp.jvminstr.JvmMemPoolEntryImpl;

public class Arifmetika {
    public static void main(String[] args) {
        // sintaksichheskyi sahar
        myIncrementation();
        myDecremantation();
        myMagicJava();
    }

    public static void myIncrementation() {
        int a = 5;
        a = a + 10;//15
        a += 10;//25
        a++;//26
        ++a;// not use next 2 months
        System.out.println(a);

    }

    public static void myDecremantation() {
        int a = 10;
        a = a - 1;
        a -= 1;
        a--;
        System.out.println(a);
    }

    public static void myMagicJava() {
        int a = 10;
        a = a * 2;
        a *= 2;
        // a** dlya ymnogeniya ne rabotaet
        System.out.println(a);
    }
}
