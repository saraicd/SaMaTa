package main.java;

public class Circle extends Figure {
    private PointClass center;
    private double radius;

    public Circle(PointClass center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
