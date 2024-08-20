package lesson11;

import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class MainShape {
    public static void main(String[] args) {


        shape.Circle circle=new Circle(3);
        System.out.println("Длина окружности:" +circle.getCircumference());
        System.out.println("Площадь окружности:"+circle.getArea());

        Rectangle Rectrect=new Rectangle(2, 4);
        System.out.println("Периметр прямоугольника:" +Rectrect.getCircumference());
        System.out.println("Площадь прямоугольника:" +Rectrect.getArea());

        Triangle triangleTest=new Triangle(2,4,3);
        System.out.println("Периметр трехугольника:"+triangleTest.getCircumference());
        System.out.println("Площадь трехугольника:"+triangleTest.getArea());
    }
}
