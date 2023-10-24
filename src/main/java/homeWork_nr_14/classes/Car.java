package homeWork_nr_14.classes;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {
    private Integer countOfWhell;

    public Car(String name, Integer powerOfEngine, Integer countOfWhell) {
        super(name, powerOfEngine);
        this.countOfWhell = countOfWhell;
    }
}
