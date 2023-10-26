package homeWork_nr_14.classes;

import java.io.Serializable;

public class Airplane extends Vehicle  implements Flyable, Serializable {
    private Integer countOfEngine;

    public Airplane(String name, Integer powerOfEngine, Integer countOfEngine) {
        super(name, powerOfEngine);
        this.countOfEngine = countOfEngine;
    }

    @Override
    public void fly() {
        System.out.println("Ariplane are flying");
    }
}
