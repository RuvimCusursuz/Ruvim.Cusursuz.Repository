package homework_nr_15;

import java.util.Comparator;

public enum CarsComparator {
    NAME_COMPARE(Comparator.comparing((Car c) -> c.getName())),
    YEAR_COMPARE(Comparator.comparing((Car c) -> c.getYearMade()));

    private final Comparator<Car> comparator;

    CarsComparator(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Car> getComparator() {
        return comparator;
    }
}
