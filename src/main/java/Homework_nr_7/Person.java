package Homework_nr_7;

abstract public class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printMyName() {
        System.out.println("I am " + name + " " + surname);
    }
}
