package lesson13;

public class Practise {
    public static void main(String[] args) {
        //  costOfElecticity(300);//70
        //costOfElecticity(98);//
        double basketball = 320;
        System.out.println(typeOfBox(basketball));
        double volleyball = 250;
        System.out.println(typeOfBox(volleyball));
        System.out.println(typeOfBox(70.0));
        System.out.println(typeOfBox(100.0));
        System.out.println(typeOfBox(200.0));
        System.out.println(typeOfBox(500.0));
        System.out.println(currencyConverter(1000, "EUR"));
        System.out.println(currencyConverter(20, "GPB"));
        System.out.println(currencyConverter(700, "RUB"));
        System.out.println(currencyConverter(70.5, "USD"));
        System.out.println(justAsking("EUR", "RUB"));
        System.out.println(findCourse("RUB"));
        System.out.println(currencyConverterUpdate(100, "EUR", "RUB"));

    }

    private static void costOfElecticity(int kB) {
        //  1kB-0,2
        // Monthly -30
        //100kb
        double monthCost = 30.0;
        if (kB > 100) {
            monthCost += (0.2 * (kB - 100));
        }
        System.out.println(monthCost);
    }

    public static String typeOfBox(double ballDiameter) {
        /*Тип А - 200x200x200 мм Тип Б -150x150x150 мм Тип В -250x250x250 мм Тип Г -350x400x500 мм Тип Д -400x400x400 мм*/
        ballDiameter = ballDiameter * 1.05;
        if (ballDiameter <= 150) {
            return "Type B";
        } else if (ballDiameter <= 200) {
            return "Type A";
        } else if (ballDiameter <= 250) {
            return "Type C";
        } else if (ballDiameter <= 350) {
            return "Type D";
        } else if (ballDiameter <= 400) {
            return "Type D";
        } else {
            return "Unknown";
        }
    }

    public static double currencyConverterUpdate(double money, String curNameInput, String curNameOutput) {
        return money*justAsking(curNameInput,curNameOutput);
    }

    public static double justAsking(String currencyNameInput, String currencyNameOutput) {
        return findCourse(currencyNameInput) / findCourse(currencyNameOutput);
    }

    public static double currencyConverter(double money, String currencyName) {
        return findCourse(currencyName) * money;
    }

    public static double findCourse(String currencyName) {
        double currencyCourse = 0.0;
        switch (currencyName) {
            case "USD":
                currencyCourse = 1.0;
                break;
            case "GPB":
                currencyCourse = 1.33;
                break;
            case "EUR":
                currencyCourse = 1.21;
                break;
            case "RUB":
                currencyCourse = 0.014;
                break;
            default:
                currencyCourse = 0;
                break;
        }
        return currencyCourse;
    }
}
