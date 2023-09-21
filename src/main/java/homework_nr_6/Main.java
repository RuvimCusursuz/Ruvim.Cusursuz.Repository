package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        Invoice nr126 = new Invoice("Traktor", "vehicle for working on the field", 4, 35999.99);
        nr126.getAmount();
        Date wifeBirthday = new Date(15, 11, 1995);
        wifeBirthday.setDay(10);
        wifeBirthday.setMonth(12);
        wifeBirthday.setYear(1999);
        wifeBirthday.displayDate();


    }
}
