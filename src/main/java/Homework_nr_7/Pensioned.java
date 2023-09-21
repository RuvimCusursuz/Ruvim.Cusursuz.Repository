package Homework_nr_7;

import java.util.Date;

 abstract public class Pensioned extends Person{
    Date retireDate;
    int age;

    public Pensioned(String name, String surname, Date retireDate, int age) {
        super(name, surname);
        this.retireDate = retireDate;
        this.age = age;
    }
}
