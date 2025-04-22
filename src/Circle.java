public class Circle extends Shape {
    private int radius;

    Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }
}
