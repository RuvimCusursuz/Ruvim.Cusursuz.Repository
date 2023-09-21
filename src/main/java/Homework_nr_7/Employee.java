package Homework_nr_7;

abstract public class Employee extends Person{
    String companyName;

    public Employee(String name, String surname, String companyName) {
        super(name, surname);
        this.companyName = companyName;
    }

    abstract public void work();
}
