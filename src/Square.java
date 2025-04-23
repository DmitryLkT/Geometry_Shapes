public class Square extends Shape {
    private int a;

    Square(String title, int a) {
        super(title);
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return a * 4;
    }
}
