package homeWork_nr_14;


import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List <Float> floatList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List <Double> doubleList = new ArrayList<>();

        for (Float i = 0f; i < 20; i= i + 0.5f) {
            floatList.add(i);
        }
        for (Double i = 0d; i < 20; i= i + 0.3d) {
            doubleList.add(i);
        }
        for (Integer i = 0; i < 20; i++) {
            integerList.add(i);
        }
        GenerecNum<Float> floatGenerecNum = new GenerecNum<>("floatNum", floatList);
        floatGenerecNum.printAllNumbers();
        System.out.println("-----------------------");
        GenerecNum<Double> doubleGenerecNum= new GenerecNum<>("doubleNum", doubleList);
        doubleGenerecNum.printAllNumbers();
        System.out.println("--------------------");
        GenerecNum<Integer> integerGenerecNum = new GenerecNum<>("integerNum", integerList);
        integerGenerecNum.printAllNumbers();
    }
}
