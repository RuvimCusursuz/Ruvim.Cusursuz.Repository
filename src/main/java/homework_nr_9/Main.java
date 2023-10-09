package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant(45, "Maxik");
        elephant.eat();
        elephant.sleep();
        elephant.move();
        System.out.println(Animalble.isAnimal());
        Erbivor elephantIgor = new Elephant(900, "Igor");
        System.out.println("Igor need " + elephantIgor.howMuchKiloneedErbivor(900) + " kg food");
        elephantIgor.erBivorIsOnPlants();
    }
}
