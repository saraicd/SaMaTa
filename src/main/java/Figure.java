package main.java;

public abstract class Figure {
    String color;

    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double perimeter();

}
