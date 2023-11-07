package homework_nr_15;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Car implements Comparable<Car>{
    private String name;
    private  Integer yearMade;

    @Override
    public int compareTo(Car o) {
        return Comparator.comparing((Car c) -> c.name)
                .thenComparing((Car c)-> c.yearMade)
                .compare(this, o);
    }
}
