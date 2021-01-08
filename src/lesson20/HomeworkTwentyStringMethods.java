package lesson20;

public class HomeworkTwentyStringMethods {
    public static void main(String[] args) {
        charAtIntIndexExample();
        codePointAtIntIndexExample();
        codePointBeforeIntIndexExample();
        codePointCountIntBegEndIndexExample();
        compareToIgnoreCaseStringStrExample();
        concatStringStrExample();
        containsCharSequenceExample();
        endsWithStringSuffixExample();
        startsWithStringPrefixExample();
        equalsObjectAnObjectExample();
        equalsIgnoreCaseStringAnotherStringExample();
        indexOfIntChExample();
        isEmptyExample();
        lengthExample();
        replaceCharOldCharCharNewCharExample();
        toCharArrayExample(); // ne ponyatno
        toLowerCaseExample();
        toUpperCaseExample();
        trimExample();

    }


    public static void charAtIntIndexExample() {
        //works with one symbol and can print this symbol
        String sentence = "Go away Coronavirus";//-> GaC (first letters of each word)
        System.out.println(sentence.charAt(0) + sentence.charAt(3) + sentence.charAt(8)); //truk ne udalsya
        char firstLetterFirstWord = sentence.charAt(0);
        char firstLetterSecondWord = sentence.charAt(3);
        char firstLetterThirdWord = sentence.charAt(8);
        System.out.println(firstLetterFirstWord + firstLetterSecondWord + firstLetterThirdWord);//truk ne udalsya
        System.out.print(sentence.charAt(0));
        System.out.print(sentence.charAt(3));
        System.out.print(sentence.charAt(8));
        System.out.println();
        System.out.println("=======");

    }

    public static void codePointAtIntIndexExample() {
        // shows the number of symbol
        String sentence = "Happy New Year";
        System.out.println(sentence.codePointAt(0));
        String symbol = "@";
        System.out.println(symbol.codePointAt(0));
        char At = 64;// ->@
        System.out.println(At);
        System.out.println("=======");
    }

    private static void codePointBeforeIntIndexExample() {
        //starts counting from 1 and shows unicode of symbol; 0 doesn't exist/error
        String word = "Europa";
        System.out.println(word.codePointBefore(1));
        char capitalLetter = 69;//->E
        System.out.println(capitalLetter);
        System.out.println("=======");
    }

    private static void codePointCountIntBegEndIndexExample() {
        //counts number of indexes by deduction from last to first - i don't understand for what we can use this method
        String word = "Incrediable";
        System.out.println(word.codePointCount(1, 4));//->3
        System.out.println("=======");
    }

    private static void compareToIgnoreCaseStringStrExample() {
//compare 2 Strings by giving an answer 0=equal; >0 the first String is longer than other;
// <0 the first String is shorter than other *methods ignores Upper/lower case
        String str1 = "Today is Christmas day";
        String str2 = "Today is christmas Day";
        String str3 = "Today is Christmas";
        System.out.println(str1.compareToIgnoreCase(str2)); //->0
        System.out.println(str1.compareToIgnoreCase(str3));//-> >0
        System.out.println(str3.compareToIgnoreCase(str1));// -> <0
        System.out.println("=======");
    }

    private static void concatStringStrExample() {
        //unites concat String to other String
        String sentence = "I don't have christmas mood!";
        sentence = sentence.concat(" Because there is no snow!");
        System.out.println(sentence);
        String firstName = "Natalia";
        String lastName = " Romanova";
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println("=======");
    }

    private static void containsCharSequenceExample() {
        //checks if it contains searched sentence/word/part of word/symbol, returns true/false
        String str = "Hello, people";
        System.out.println(str.contains("lo"));//->true
        System.out.println(str.contains(","));//->true
        System.out.println(str.contains("people"));//->true
        System.out.println(str.contains("e"));//->true
        System.out.println(str.contains("oep"));//->false
        System.out.println("=======");
    }

    private static void endsWithStringSuffixExample() {
        // checks if the last symbol/symbols at the last word of the String ends with searched suffix,
        // returns true/false
        String sentence = "lets play and run";
        System.out.println(sentence.endsWith("ay"));//false
        System.out.println(sentence.endsWith("d"));//false
        System.out.println(sentence.endsWith("n"));//true
        System.out.println(sentence.endsWith("a"));//false
        System.out.println(sentence.endsWith("un"));//true
        System.out.println(sentence.endsWith("in"));//false
        System.out.println("=======");
    }

    private static void startsWithStringPrefixExample() {
        // checks if the first symbol/symbols at the first word of the String start with searched prefix,
        // returns true/false
        String sentence = "lets play and run";
        System.out.println(sentence.startsWith("le"));//true
        System.out.println(sentence.startsWith("l"));//true
        System.out.println(sentence.startsWith("l; p"));//false
        System.out.println(sentence.startsWith("l, p"));//false
        System.out.println(sentence.startsWith("an"));//false
        System.out.println(sentence.startsWith("la"));//false
        System.out.println("=======");
    }

    private static void equalsObjectAnObjectExample() {
        // compares Strings; replace symbol"="; returns true/false
        String str1 = "Christmas song";
        String str2 = "Christmas Song";
        String str3 = "Christmas songs";
        String str4 = "Christmas song";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equals(str3)); //false
        System.out.println(str1.equals(str4)); //true
        System.out.println("=======");
    }

    private static void equalsIgnoreCaseStringAnotherStringExample() {
        // compares Strings and ignoring Upper/Lower case;returns true/false
        String str1 = "Christmas song";
        String str2 = "Christmas Song";
        String str3 = "Christmas songs";
        String str4 = "ChristmAs soNg";
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //false
        System.out.println(str1.equalsIgnoreCase(str4)); //true
        System.out.println("=======");
    }

    private static void indexOfIntChExample() {
        //gives the number of index of the letter from 01234...(Vasiliy); if letter doesn't exist -prints -1
        String firstName = "NataliaR";
        System.out.println(firstName.indexOf('a'));//1
        System.out.println(firstName.indexOf('k'));//-1
        System.out.println(firstName.indexOf('R'));//7
        System.out.println("=======");
    }

    private static void isEmptyExample() {
        //checks the length of the String, when String is empty returns true, other-false
        String word1 = "";
        String word2 = "Let is snow";
        System.out.println(word1.isEmpty());//true
        System.out.println(word2.isEmpty());//false
        System.out.println("=======");
    }

    private static void lengthExample() {
        //shows the length of the String, if String is empty returns 0, other -number of the String counts from 1
        String input1 = "";
        String input2 = "Lara";
        System.out.println(input1.length());//0
        System.out.println(input2.length());//4
        System.out.println("=======");
    }

    private static void replaceCharOldCharCharNewCharExample() {
        // replaces symbols;
        String input = "Karaoke";
        String input2 = " ";
        System.out.println(input.replace('a', 'i'));
        System.out.println(input2.replace(' ', 'y'));
        System.out.println("=======");
    }

    private static void toCharArrayExample() {
        //?
        String str1 = "Candy";
        char[] array = str1.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=======");
    }

    private static void toLowerCaseExample() {
        //changes from capital letter to small letter
        String input = "WOMAN IN RED";
        System.out.println(input.substring(0, 1) + input.substring(1).toLowerCase()); //Woman in red
        System.out.println("=======");
    }

    private static void toUpperCaseExample() {
        //changes from small letter to capital letter
        String input = "sea, salt, sun";
        System.out.println(input.substring(0, 1).toUpperCase() + input.substring(1, 5) + input.substring(5, 6).toUpperCase() +
                input.substring(6, 11) + input.substring(11, 12).toUpperCase() + input.substring(12));//Sea, Salt, Sun
        System.out.println("=======");
    }

    private static void trimExample() {
        // delete spaces at the beginning or at the end of String
        String sentence = " We wish you a Merry Christmas ";
        System.out.println("'" + sentence.trim() + "'");//'We wish you a Merry Christmas'
    }

}


