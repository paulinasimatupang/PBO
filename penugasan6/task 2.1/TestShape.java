public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape.toString());

        Circle circle = new Circle(2.0, "red", true);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "green", false);
        System.out.println(rectangle.toString());

        Square square = new Square(5.0, "yellow", true);
        System.out.println(square.toString());
    }
}
