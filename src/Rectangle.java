public class Rectangle extends Shape {
    int a;
    int b;

    Rectangle(String title, int a, int b) {
        super(title);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }
}
