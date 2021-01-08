package lesson05;

public class HomeworkFive {
    public static void main(String[] args) {
        System.out.println(exercise01BigBadaBoom(true, true));
        System.out.println(exercise01BigBadaBoom(false, false));
        System.out.println(exercise01BigBadaBoom(true, false));
        split();
        System.out.println(exercise02DoorBell(true, true));
        System.out.println(exercise02DoorBell(false, false));
        System.out.println(exercise02DoorBell(true, false));
        System.out.println(exercise02DoorBell(false, true));
        split2();
        boolean key, internetElectricity;
        key = false;
        internetElectricity = true;
        System.out.println(exercise03SmartDoorCheckKey(key, internetElectricity));

        key = true;
        internetElectricity = false;
        System.out.println(exercise03SmartDoorCheckKey(key, internetElectricity));

        key = false;
        internetElectricity = false;
        System.out.println(exercise03SmartDoorCheckKey(key, internetElectricity));

        key = true;
        internetElectricity = true;
        System.out.println(exercise03SmartDoorCheckKey(key, internetElectricity));
    }


    public static boolean exercise01BigBadaBoom(boolean capFirst, boolean capSecond) {
        //bigBadaBoom(true, true) -> true
        //  bigBadaBoom(false, false) -> false
        //  bigBadaBoom(true, false) -> false
        return capSecond && capSecond;
    }

    public static void split() {
        System.out.println("=================");
    }

    public static boolean exercise02DoorBell(boolean bell1, boolean bell2) {
        return bell1 != bell2;

    }

    public static void split2() {
        System.out.println("============");
    }

    public static boolean exercise03SmartDoorCheckKey(boolean key, boolean internetElectricity) {
        return key != internetElectricity;

    }
}
