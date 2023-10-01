package homework_nr_9;

import java.sql.SQLOutput;

public class Elephant extends Erbivor implements Animalble{

    Integer wieght;
    String  name;

    public Elephant(Integer wieght, String name) {
        this.wieght = wieght;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Elephant is going slow");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eat grass");

    }
}
