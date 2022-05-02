package main.java;

import java.awt.*;

public class Rectangle extends Figure{
    private Point upperLeft;
    private Point bottomRight;

    public Rectangle(Point upperLeft, Point bottomRight) {
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(){}
}
