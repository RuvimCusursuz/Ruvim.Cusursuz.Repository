package HomeWork_nr_16;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        try {
            BufferedReader bf1 = new BufferedReader(new FileReader("D:/Teckwell/File/Input.txt"));
            String bufferString = "";
            while (bufferString != null) {
                bufferString = bf1.readLine();
                if (bufferString != null) {
                    String[] splittedString = bufferString.split(",");
                    personList.add(new Person(splittedString[0], Integer.parseInt(splittedString[1]), Double.parseDouble(splittedString[2])));
                    System.out.println(bufferString);
                }
            }
            bf1.close();
        } catch (IOException e) {
            e.getStackTrace();
        }

        personList.stream()
                .forEach(e -> System.out.println(e));

        Double aritNote = personList.stream()
                .mapToDouble(Person::getNote)
                .average()
                .orElse(0.0d);

        Double aritAge = personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        Optional<String> oldestPerson = personList.stream()
                .max(Comparator.comparingInt(Person::getAge)).map(Person::getName);
        Optional<String> littlePerson = personList.stream()
                .min(Comparator.comparingInt(Person::getAge)).map(Person::getName);

        String writer = "Средний Балл: " + aritNote + "\n" +
                "Самый молодой Человек: "  + littlePerson.get() + "\n" +
                "Самый старший Человек:" + oldestPerson.get() + "\n" +
                "Средний возраст: " + aritAge;

        try{
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:/Teckwell/File/Output.txt"));
            bw1.write(writer);
            bw1.close();
        } catch (IOException e){
            e.getStackTrace();
        }
    }





}
