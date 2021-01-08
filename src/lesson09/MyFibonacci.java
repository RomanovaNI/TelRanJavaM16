package lesson09;

public class MyFibonacci {
    public static void main(String[] args) {
        lineFibonacci(11);//peredaem
    }
    public static void lineFibonacci(int number){//prinimaem
        int n0=0;
        int n1=1;
        System.out.print(n0+" "+n1+" ");
        for (int i = 0; i < number-2; i++) {
            int nNext=n0+n1;
            System.out.print(nNext+" ");
            n0=n1;
            n1=nNext;

        }


        }

    }

