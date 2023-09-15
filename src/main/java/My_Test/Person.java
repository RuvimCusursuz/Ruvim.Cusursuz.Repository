package My_Test;

public class Person {
    static int numberOfPerson = 0;
    String name;
    String surname;
    int age;
    boolean isMale;

    public Person(String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPerson++;
    }
    public void sayMyName(){
        System.out.println("my name is " + this.name);
    }

    public static void printNrofPerson(){
        System.out.println("Currrent number of persons is " + numberOfPerson);
    }
}
