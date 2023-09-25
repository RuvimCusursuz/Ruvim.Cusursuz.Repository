package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if ((0 <= day) && (day <= 31)) {
            this.day = day;
        } else {
            System.out.println("invalid number of day");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((0 <= day) && (day <= 12)) {
            this.month = month;
        } else {
            System.out.println("invalid number of Month");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("You are before Christ");
        }
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

