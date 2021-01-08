package lesson19;

public class HomeworkNineteenPriceOfTheHouse {
    public static void main(String[] args) {
        System.out.println("The price to build the house is " + priceOfTheHouse() + " euro");

    }
    private static double priceOfTheHouse() {
        double result = materialCost() + hardwareCost() + workerCost();
        return result;
    }

    private static double workerCost() {

        double courseDolEur = 0.82;
        int numberOfWorker = 3;
        double priceWorkerHourDol = 25.0;
        double priceWorkerHourEur = priceWorkerHourDol * courseDolEur;
        int numberOfBrigadier = 1;
        double priceBrigadierHourDol = 35.0;
        double priceBrigadierHourEur = priceBrigadierHourDol * courseDolEur;
        double workDays = 10.0;
        double workHours = workDays * 8.0;
        double result = numberOfWorker * priceWorkerHourEur * workHours + numberOfBrigadier * priceBrigadierHourEur * workHours;
        //     System.out.println(result);
        return 0;
    }

    private static double hardwareCost() {
        double priceOfTheCrane = 100.0;
        int days = 14;
        double result = priceOfTheCrane * days;
        // System.out.println(result);
        return result;
    }

    private static double materialCost() {
        double result = woodCost() + colorCost();
        return result;
    }

    private static double houseArea() {
        double houseLength = 11.0;
        double houseWidth = 12.0;
        double houseHeight = 3.0;
        return houseLength * houseHeight * 2.0 + houseWidth * houseHeight * 2.0;
    }

    private static double colorCost() {
        double colorPriceSquareMeter = 20.0 / 3.0;
        //     System.out.println(colorPriceSquareMeter);
        return colorPriceSquareMeter * houseArea();
    }

    private static double woodCost() {
        double priceOneCubicMeter = 250.0;
        double cubicAmountOfWood = 288.0; // ya ne znau kak delat etot raschet matematicheski
        double result = priceOneCubicMeter * cubicAmountOfWood;
        return result;
    }
}
