package homework_nr_15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> s1 = new HashSet<>(Arrays.asList(
                new Car("BMW", 2004),
                new Car("Audi", 2007),
                new Car("Opel", 2005),
                new Car("BMW", 2009),
                new Car("Mercedes", 2015),
                new Car("KIA", 2001),
                new Car("Opel", 2017))
        );
        s1.stream()
                .sorted(CarsComparator.YEAR_COMPARE.getComparator())
                .forEach((e) -> System.out.println(e));

        System.out.println("-----------------------------");
        TreeSet<Car> t1 = new TreeSet<>(Arrays.asList(
                new Car("BMW", 2004),
                new Car("Audi", 2007),
                new Car("Opel", 2005),
                new Car("BMW", 2009),
                new Car("Mercedes", 2015),
                new Car("KIA", 2001),
                new Car("Opel", 2017))
        );
        t1.stream().forEach(s-> System.out.println(s));
    }
}
