package homeWork_nr_14.classes;

import java.io.Serializable;

public class Helicopter extends Vehicle implements Flyable, Serializable {

    private Integer countOfVentilator;

    public Helicopter(String name, Integer powerOfEngine, Integer countOfVentilator) {
        super(name, powerOfEngine);
        this.countOfVentilator = countOfVentilator;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter are flying");
    }
}
