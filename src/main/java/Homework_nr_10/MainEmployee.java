package Homework_nr_10;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Predicate;

public class MainEmployee {
    public static void main(String[] args) {

        Employee alex = new Employee( "Alex", "Medvedev", 50, "TeamLead");
        Employee ben = new Employee( "Ben", "Medvedev", 32, "Junior devoloper");
        Employee ella = new Employee( "Ella", "Medvedev", 45, "Software Engineering");
        Employee kot = new Employee( "Kote", "Medvedev", 19, "TeamLead");
        Employee bella = new Employee( "Bella", "Medvedev", 12, "Software Engineering");
        Employee piotr = new Employee( "Piotr", "Medvedev", 29, "TeamLead");
        Employee ruvim = new Employee( "Ruvim", "Medvedev", 17, "Boss");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(alex);
        employees.add(ben);
        employees.add(ella);
        employees.add(kot);
        employees.add(bella);
        employees.add(piotr);
        employees.add(ruvim);

        Predicate<Employee> softafareEngineeringEmployee = e -> e.department.equals("Software Engineering");
        Predicate<Employee> older20 = e -> e.age > 20 ;
        Predicate<Employee> nameBiginnsWithA = e -> e.name.startsWith("A");

        for (Employee e : employees){
            System.out.println(e.name + " is a Software Engineering = " + Employee.testEmployee(e, softafareEngineeringEmployee));
            System.out.println(e.name + " is older 20 = " + Employee.testEmployee(e, older20));
            System.out.println(e.name + " name beginns with A = " + Employee.testEmployee(e, nameBiginnsWithA));
        }

        for (Employee e :employees){
            if(Employee.testEmployee(e,softafareEngineeringEmployee) == true){
                System.out.println(e.name + " is a Software Engineering");
            }
            if(Employee.testEmployee(e, older20) == true){
                System.out.println(e.name + " is older 20");
            }
            if(Employee.testEmployee(e,nameBiginnsWithA) == true){
                System.out.println(e.name + " name beginns with A");
            }
        }

    }
}
