package shapeIntr;

public class Main {
    public static void main(String[] args) {
        CircleIntr circle = new CircleIntr(2, "Yellow", "Red");
        RectangleIntr rectangle = new RectangleIntr(4, 6, "Blue", "Green");
        TriangleIntr triangle = new TriangleIntr(5, 10, 12, "Black", "Turquoise");

        System.out.println("Circle:");
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Fill Color: " + circle.getFillColor());
        System.out.println("Border Color: " + circle.getBorderColor());

        System.out.println("\nRectangle:");
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Fill Color: " + rectangle.getFillColor());
        System.out.println("Border Color: " + rectangle.getBorderColor());

        System.out.println("\nTriangle:");
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Fill Color: " + triangle.getFillColor());
        System.out.println("Border Color: " + triangle.getBorderColor());
    }
}