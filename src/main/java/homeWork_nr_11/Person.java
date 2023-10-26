package homeWork_nr_11;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Boolean isPayedByhour;

    public Person(String name, String surname, Integer age, Boolean isPayedByhour) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isPayedByhour = isPayedByhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getPayedByhour() {
        return isPayedByhour;
    }

    public void setPayedByhour(Boolean payedByhour) {
        isPayedByhour = payedByhour;
    }
}
