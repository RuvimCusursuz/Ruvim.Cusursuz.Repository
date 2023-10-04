package Homework_nr_10;

import java.util.function.Predicate;

public class Employee {
    String name;
    String surname;
    Integer age;
    String department;

    public Employee(String name, String surname, Integer age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public static boolean testEmployee(Employee e, Predicate predicate){
        return predicate.test(e);
    }
}
