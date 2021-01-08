package lesson09;

public class HomeworkNine {
    public static void main(String[] args) {
        System.out.println(more20(20));// → false
        System.out.println(more20(22));// → true
        System.out.println(more20(42));// → true
        split();
        System.out.println(nearTen(10));// → true
        System.out.println(nearTen(13)); //→ false
        System.out.println(nearTen(19));// → true
    }

    private static boolean nearTen(int number) {

        //  return (number - 1) % 10 == 0 || (number - 2) % 10 == 0 || (number + 2) % 10 == 0 ||
        //          (number + 1) % 10 == 0 || number % 10 == 0;
        return number % 10 <= 2 || number % 10 >= 8;
    }

    public static void split() {
        System.out.println("=============");
    }

    private static boolean more20(int number) {

      /*  if (number % 20 == 0) {
        }
        if ((number > 20) && number < 23) {
            return true;
        } else
            return false;*/
        //   return (number - 1) % 20 == 0 || (number - 2) % 20 == 0;
        int temp = number % 20;
        if (temp - 1 == 0 || temp - 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}




