package main.java;

import java.awt.*;

public class Rectangle extends Figure {
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }


    public Rectangle(){}

    @Override
    public double perimeter() {
        return 0;

    public Rectangle() {
    }

    @Override
    public double area() {
        return Math.abs(upperLeft.getX() - bottomRight.getX()) * Math.abs(upperLeft.getY() - bottomRight.getY());

    }
}
