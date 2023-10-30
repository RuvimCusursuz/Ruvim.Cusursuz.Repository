package HomeWork_nr_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
    try{
        BufferedReader bf1 = new BufferedReader(new FileReader("D:/Teckwell/File/Test.txt"));
//        System.out.println(bf1.readLine());
        String bufferString = "";
        System.out.println(new File("D:/Teckwell/File/Test.txt").isFile());
        while(!(bufferString == null) ){
            bufferString = bf1.readLine();
            if (!(bufferString== null)) {
                String[] splittedString = bufferString.split(",");
                personList.add(new Person(splittedString[0], Integer.parseInt(splittedString[1]), Double.parseDouble(splittedString[2])));
                System.out.println(bufferString);
            }
        }
        bf1.close();
    } catch (IOException e){
        e.getStackTrace();
    }
    personList.stream()
            .map(e -> e.getName())
            .forEach(e -> System.out.println(e));
    }
}
