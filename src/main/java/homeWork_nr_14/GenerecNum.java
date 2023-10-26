package homeWork_nr_14;

import java.util.List;

public class GenerecNum <T extends Number>{
    private final String name;
    private List<T> listOfNum;

    public GenerecNum(String name, List<T> listOfNum) {
        this.name = name;
        this.listOfNum = listOfNum;
    }

    public void printAllNumbers(){
        for (T num :
             listOfNum) {
            System.out.println(num);
        }
    }
}
