package homework_nr_9;

public interface Animalble {

    void move();
    void eat();

    default void sleep(){
        System.out.println("Animal are sleeping");
    }

     static boolean isAnimal(){
         return true;
    }
}
