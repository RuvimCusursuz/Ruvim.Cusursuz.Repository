package Homework_nr_7;

public class Manager extends Employee {
    int teamSize;
    String teamName;

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work(){
        System.out.println("Manager is responsible for " + teamName);
    }
}
