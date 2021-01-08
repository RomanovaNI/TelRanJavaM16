package lesson06;

public class HomeworkSix {
    public static void main(String[] args) {
        //Напишите программу действий кассира магазина, если у него пытаются купить алкоголь
        //5 покупателей: 10 лет, 17 лет, 18 лет, 20 лет и 30 лет

        System.out.println("When the buyer is 10, alko is " + exerciseOneCashierJob(10));//how to make the message "When the buyer is 10, alko is forbidden (+case10)
        System.out.println(exerciseOneCashierJob(17));
        System.out.println(exerciseOneCashierJob(18));
        System.out.println(exerciseOneCashierJob(20));
        System.out.println(exerciseOneCashierJob(30));
        split();
        String permission = "allow20";
        System.out.println(exerciseOneCashierJobTwo(permission));// same question "Alko is allowed for the people at the age of +permission"
        System.out.println(exerciseOneCashierJobTwo("allow30"));
        split2();
        int month = 11;
        System.out.println(exerciseTwoSeason(month));
    }

    public static String exerciseOneCashierJob(int ageOfBuyer) {
        String permission = "";
        switch (ageOfBuyer) {
            case 10:
            case 17:
                permission = "forbidden";
                break;
            case 18:
            case 20:
            case 30:
                permission = "allow";
                break;
            default:
                permission = "doesn't exist";
                break;
        }

        return permission;
    }

    public static void split() {
        System.out.println("=============");
    }

    public static int exerciseOneCashierJobTwo(String permission) {
        int ageOfBuyer = 0;
        switch (permission) {
            case "forbidden10":
                ageOfBuyer = 10;
                break;
            case "forbidden17":
                ageOfBuyer = 17;
                break;
            case "allow18":
                ageOfBuyer = 18;
                break;
            case "allow20":
                ageOfBuyer = 20;
                break;
            case "allow30":
                ageOfBuyer = 30;
                break;
            default:
                ageOfBuyer = -1;
        }

        return ageOfBuyer;
    }

    public static void split2() {
        System.out.println("=============");
    }

    public static String exerciseTwoSeason(int month) {
//Напишите программу, которая определяет сезон года. Месяца указаны int переменными
        String season = "";
        switch (month) {
            case 1:
            case 2:
            case 12:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;

            default:
                season = "doesn't exist";
                break;
        }
        return season;
    }
}
