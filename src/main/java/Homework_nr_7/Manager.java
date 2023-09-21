package Homework_nr_7;

public class Manager extends Employee {
    int teamSize;
    int teamName;

    public Manager(String name, String surname, String companyName, int teamSize, int teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work(){
        System.out.println("Manager is responsible for " + teamName);
    }
}
