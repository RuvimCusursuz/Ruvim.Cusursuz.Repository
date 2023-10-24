package homeWork_nr_14.classes;

import java.util.ArrayList;
import java.util.List;

public class GenericClassFlyableVehicle <T extends Vehicle & Flyable>{
    private String name;

    private List<T> listOfflyableVehicle;

    public GenericClassFlyableVehicle(String name) {
        this.name = name;
        this.listOfflyableVehicle = new ArrayList<>();
    }

    public void printAllVehicle(){
        for (T element: this.listOfflyableVehicle) {
            System.out.println(element.name);
        }
    }
}
