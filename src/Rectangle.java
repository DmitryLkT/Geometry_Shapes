public class Rectangle extends Shape {
    private int a;
    private int b;

    Rectangle(String title, int a, int b) {
        super(title);
        this.a = a;
        this.b = b;
        if(a <= 0 || b <= 0) {
            System.err.println("����� �� ����� ���� �������������");
            throw new IllegalArgumentException();
        }
        if(a == b) {
            System.err.println("����� �� ����� ���� �����");
            throw new IllegalArgumentException();
        }
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
