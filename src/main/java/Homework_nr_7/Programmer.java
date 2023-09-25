package Homework_nr_7;

public class Programmer extends Employee {
    String programmingLanguage;
    int yearsOfExpirience;

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExpirience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExpirience = yearsOfExpirience;
    }

    @Override
    public void work() {
        System.out.println(name + " is working with " + programmingLanguage);
    }
}
