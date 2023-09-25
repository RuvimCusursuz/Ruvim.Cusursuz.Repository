package Homework_nr_7;

public class Main {
    public static void main(String[] args) {
        Manager peter = new Manager("Peter", "Janzen", "Microsoft", 10, "SurfaceTeam");
        Manager david = new Manager("David", "Podlich", "Microsoft", 7, "LaptopTeam");
        Manager micha = new Manager("Micha", "Neumann", "Technische Krankenkasse", 4, "RufDienstTeam");
        Programmer markus = new Programmer("Markus", "Schwarz", "Microsoft", "Java", 3);
        Programmer lion = new Programmer("Lion", "Lie", "Microsoft", "JavaScript", 4);

        david.printMyName();
        markus.work();

        Person[] employees= new Person[]{peter,david, markus, micha, lion};

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Manager){
                ((Manager) employees[i]).work();
            }

        }

    }
}
