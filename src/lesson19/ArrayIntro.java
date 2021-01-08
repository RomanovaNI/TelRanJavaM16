package lesson19;

public class ArrayIntro {
    public static void main(String[] args) {
      //  introOne();
      //  introOld();
        arrayDeclarationAndInitialisation();
        germanCitiesExample();
    }
    private static void anotherExample() {
        String hm = "Василий";
        String gubernator = "Schwartzeneger";
        String[] people = new String[]{hm, gubernator};
/*        System.out.println(hm.length());
        System.out.println(people[0].length());
        System.out.println(people[1].length());
        System.out.println(people[0].length() + people[1].length());*/
        //System.out.println(people.length);
        int result = 0;
        for (int i = 0; i < people.length; i++) {
            result = result + people[i].length();
        }
        System.out.println(result);
        System.out.println(people[0].length());
    }

    private static void germanCitiesExample() {
        String[] germanCities = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Düsseldorf", "Köln"};
        int allGermanCitiesLength = 0;
        int allGermanCities = germanCities.length;
        System.out.println(allGermanCities);
        for (int i = 0; i < germanCities.length; i++) {
            allGermanCitiesLength = allGermanCitiesLength + germanCities[i].length();
        }
        System.out.println(allGermanCitiesLength);
    }

    private static void arrayDeclarationAndInitialisation() {
        // <<ИмяУжеОбъявленнойПеременной>> = new <<типДанных>> <<ДлинаМассива>>
        int[] justExample = new int[10];
        int[] justExampleTwo;
        justExampleTwo = new int[1001];
        int[] field = new int[]{10, 15, 3, 7, 4, 9, 8};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String theBestCitiInTheWorld = "Berlin";
        String[] germanCities = new String[]{theBestCitiInTheWorld, "München", "Dresden", "Hamburg", "Düsseldorf"};

        String[] fourSeasons = new String[]{"Vivaldi", "Чайковского", "Стивен Кинг", "Гостиница"};

    }

    public static void introOld (){
        int myArray[];
        String user[];
        double gpsPoints[];
        boolean truthTable[];
        char cyrillicAlphabet[];

    }

    private static void introOne() {
        int[] myArray;
        String []user ;
        double[] gpsPoints;
        boolean[] truthTable;
        char [] cyrillivAlphabet;

    }
}
