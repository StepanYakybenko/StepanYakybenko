package lesson11;

import shape.Shape3;

public class Circle extends Shape3 {
    private double r; // Радиус круга

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getGirth() {
        return 0;
    }

}
