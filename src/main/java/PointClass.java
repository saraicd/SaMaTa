package main.java;

public class PointClass {
    double coordX;
    double coordY;


    public PointClass (double coordX, double coordY){
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    public double coordX() {
        return coordX;
    }

    public double coordY() {
        return coordY;
    }
}
