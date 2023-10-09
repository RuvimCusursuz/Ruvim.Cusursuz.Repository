package Homework_nr_8.Vocabulary;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> vocabularyDeutshRussisch = new HashMap<>();
        vocabularyDeutshRussisch.put("gehen", "идти");
        vocabularyDeutshRussisch.put("schlafen", "спать");
        vocabularyDeutshRussisch.put("wollen", "хотеть");
        vocabularyDeutshRussisch.put("Das Haus", "дом");
        vocabularyDeutshRussisch.put("lange", "длинный");
        vocabularyDeutshRussisch.put("machen", "делать");
        vocabularyDeutshRussisch.put("legen", "ложить");
        vocabularyDeutshRussisch.put("Der Hund", "собака");
        vocabularyDeutshRussisch.put("Das Auto", "автомобиль");
        vocabularyDeutshRussisch.put("danke", "спасибо");

        for (String example: vocabularyDeutshRussisch.keySet()
             ) {
            String value = vocabularyDeutshRussisch.get(example);
            System.out.println(value + " = " + example);

        }
    }
}
