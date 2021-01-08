package lesson07;

public class HelloZina {
    public static void main(String[] args) {
        System.out.println(salesPermissionOne(17));
        salesPermissionTwo(15);
    }

    public static String salesPermissionOne(int age) {
        String result = "";
        if (age >= 18) {
            result = "allow";
        } else {
            result = "forbidden";
        }
        return result;
    }

    public static void salesPermissionTwo(int age) {
        String result = "";
        if (age < 16) {
            System.out.println(result = "too young");
        } else if (age >= 16 && age < 18) {
            System.out.println(result = "allow bear");
        } else if (age < 21) {
            System.out.println("except vodka");
        } else {
            System.out.println("allow");
        }

    }
}

