package My_Test;

public class MyTest {
    public static void main(String[] args) {
        Car BMW = new Car(400, 20, true);

        BMW.drive();
        System.out.println(BMW.returnAWD());

        Person ruvim = new Person("Ruvim", "Cusursuz", 28, true);
        System.out.println(ruvim.name);

        Person artiom = new Person("Artem", "Cusursuz", 15, true)  ;
        System.out.println(artiom.name);
        System.out.println(Person.numberOfPerson);
        artiom.sayMyName();
        Person.printNrofPerson();

        String[] names = new String[4];

    }
}
