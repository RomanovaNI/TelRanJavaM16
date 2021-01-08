package lesson07;

import com.sun.scenario.effect.Brightpass;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Statement;

public class HomeworkSeven {
    public static void main(String[] args) {

        System.out.println(drivingPenalties(56));
        System.out.println(strangeExercise(-1));
        System.out.println(strangeExerciseString("pink"));
    }

    public static String drivingPenalties(int speed) {
        /*Напишите программу действий для сотрудника дорожной полиции, который остановил машину:
        при езде до 50 км/час нарушений нет;
        за езду от 50 км/час до 65 км/час — устное порицание и лекция на 5 минут;
        за превышение скорости от 16 км/час — 40 евро штрафа;
        за езду от 100 км/час до 130 км/час — штраф 500 евро;
        и за езду свыше 130 км/час — штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного средства*/
        String result = "";
        if (speed <= 50) {
            System.out.println(result = "no penalty");
        } else if (speed >= 51 && speed <= 65) {
            //speed<=65
            System.out.println(result = "Verbal warning and 5 minutes of lecture");
        } else if (speed >= 66 && speed <= 99) {
            //speed <=99
            System.out.println(result = "Penalty 40 €");
        } else if (speed <= 130) {
            System.out.println(result = "Penalty 500 euro");
            //  } else if (speed >= 131) {
            //    System.out.println(result = "Penalty 1000 €, driver's license confiscation, confiscation of the vehicle");
        } else {
            result = "Penalty 1000 €, driver's license confiscation, confiscation of the vehicle";
        }
        return result;
    }
    // Напишите программу, которая объяснит наступление определённых событий, в зависимости от выбора “витязя”.
    /*   «Направо пойдёшь – коня потеряешь, себя спасёшь;
    налево пойдёшь – себя потеряешь, коня спасёшь;
     прямо пойдёшь – и себя и коня потеряешь»*/

    public static String strangeExercise(int choice) {
        String result = "";
        if (choice == 1) {
            result = "Направо пойдёшь –коня потеряешь, себя спасёшь";
        } else if (choice == 2) {
            result = "налево пойдёшь – себя потеряешь, коня спасёшь";
        } else if (choice == 3) {
            result = "прямо пойдёшь – и себя и коня потеряешь";
            //  } else if (choice >= 4) {
            //     result = " choose from 1 to 3";
            //  } else if (choice <= 0) {
            //      result = " choose from 1 to 3";
        } else {
            result = " choose from 1 to 3";
        }

        return result;
    }

    public static String strangeExerciseString(String choice) {//kak ogranichit
        String result = "";
        // if (choice == "right")
        if (choice.equals("right")) {
            result = "Направо пойдёшь –коня потеряешь, себя спасёшь";
        } else if (choice == "left") {
            result = "налево пойдёшь – себя потеряешь, коня спасёшь";
        } else if (choice == "straight") {
            result = "прямо пойдёшь – и себя и коня потеряешь";

        } else {
            result = "wrong choice";
        }

        return result;
    }
}






