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
}
