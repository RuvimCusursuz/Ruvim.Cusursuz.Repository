package homeWork_nr_14.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericClassSeriazible <T extends Serializable> {

    private String name;

    private List<T> listOfSeriablizable;

    public GenericClassSeriazible(String name) {
        this.name = name;
        this.listOfSeriablizable = new ArrayList<>();
    }

    public void printAll(){
        for (T element:
             listOfSeriablizable) {
            System.out.println(element);
        }
    }
}
