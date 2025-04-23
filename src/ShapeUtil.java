import java.util.Random;

public class ShapeUtil {
    private Random rand = new Random();

    public Circle createRandomCircle() {
        int radius = rand.nextInt(10) + 1;
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        int a = rand.nextInt(10) + 1;
        return new Square("Square", a);
    }

    public Rectangle createRandomRectangle() {
        int a, b;
        do {
            a = rand.nextInt(10) + 1;
            b = rand.nextInt(10) + 1;
        } while(a == b);
        return new Rectangle("Rectangle", a, b);
    }

    public Shape createRandomShape() {
        int shape = rand.nextInt(2);
        if(shape == 0) {
            return createRandomCircle();
        } else if(shape == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    public double calculateArea(Shape[] shapes) {
        if(shapes == null) {
            System.err.println("Массив не может быть пустым");
            throw new ArrayIndexOutOfBoundsException();
        }
        double sumArea = 0.0;

        for(Shape s : shapes) {
            sumArea += s.calculateArea();
        }
        return sumArea;
    }

    public double calculatePerimeter(Shape[] shapes) {
        if(shapes == null) {
            System.err.println("Массив не может быть пустым");
            throw new ArrayIndexOutOfBoundsException();
        }
        double sumPerimeter = 0.0;

        for(Shape s : shapes) {
            sumPerimeter += s.calculatePerimeter();
        }
        return sumPerimeter;
    }
}
