package My_Test;

public class MyTest {
    public static void main(String[] args) {
        Car BMW = new Car(400, 20, true);

        BMW.drive();
        System.out.println(BMW.returnAWD());
    }
}
