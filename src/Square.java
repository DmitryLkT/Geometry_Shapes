public class Square extends Shape {
    private int a;

    Square(String title, int a) {
        super(title);
        this.a = a;
        if(a <= 0) {
            System.err.println("Число не может быть отрицательным");
            throw new IllegalArgumentException();
        }
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
