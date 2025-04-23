import static org.junit.Assert.assertEquals;

public class Test {
    @org.junit.Test
    public void circleCalculateArea() {
        Circle a = new Circle("A", 1);
        assertEquals(a.calculateArea(), 3.14, 0.01);
    }

    @org.junit.Test
    public void circleCalculatePerimeter() {
        Circle circle = new Circle("A", 1);
        assertEquals(circle.calculatePerimeter(), 6.28, 0.01);
    }

    @org.junit.Test
    public void squareCalculateArea() {
        Square s = new Square("A", 2);
        assertEquals( s.calculateArea(), 4.00, 0.01);
    }

    @org.junit.Test
    public void squareCalculatePerimeter() {
        Square s = new Square("A", 2);
        assertEquals(s.calculatePerimeter(), 8.00, 0.01);
    }

    @org.junit.Test
    public void rectangleCalculateArea() {
        Rectangle r = new Rectangle("A", 2, 3);
        assertEquals(r.calculateArea(), 6.00, 0.01);
    }

    @org.junit.Test
    public void rectangleCalculatePerimeter() {
        Rectangle r = new Rectangle("A", 2, 3);
        assertEquals(r.calculatePerimeter(), 10.00, 0.01);
    }
}
