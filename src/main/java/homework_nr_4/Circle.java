package homework_nr_4;

public class Circle {
    double radius;
    double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8.15);
        circle.calculateArea();
    }

    public void calculateArea() {
        System.out.println(radius * radius * pi);
    }
}
