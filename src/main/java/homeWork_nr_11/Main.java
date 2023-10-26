package homeWork_nr_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Vitalik", "Staev", 22, true));
        persons.add(new Person("Olja", "Culeva", 29, true));
        persons.add(new Person("Maks", "Karov", 37, false));
        persons.add(new Person("Vladimir", "Bober", 45, true));
        persons.add(new Person("Lena", "Staev", 18, false));
        persons.add(new Person("Olja", "Binar", 49, true));
        persons.add(new Person("Petr", "Janzen", 45, true));
        persons.add(new Person("Ans", "Ramarov", 40, true));
        persons.add(new Person("Uriy", "Linux", 40, false));
        persons.add(new Person("Ruvim", "Staev", 21, true));

        persons.stream()
                .filter(x -> x.getAge() > 25 && x.getPayedByhour() == true)
                .map(x -> x.getName())
                .distinct()
                .forEach(person -> System.out.println(person));

        System.out.println("__________________");

        ArrayList<Person> personsNew = new ArrayList<>();
        persons.stream()
                .filter(x -> x.getAge() > 30 && x.getSurname().startsWith("A"))
                .forEach(person -> personsNew.add(person));
        for (Person e : personsNew) {
            System.out.println(e.getName());
        }

        Optional<Person> optionalAgeIs37 = persons.stream().filter(x -> x.getAge() == 37).findFirst();
        if (optionalAgeIs37.isPresent()) {
            System.out.println(optionalAgeIs37.get().getName());
        }
    }
}

