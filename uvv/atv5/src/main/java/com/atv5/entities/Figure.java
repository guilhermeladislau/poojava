package uvv.atv5.src.main.java.com.atv5.entities;

public abstract class Figure {
    protected double area;
    protected double perimeter;

    public abstract void calculateArea();
    public abstract void calculatePerimeter();

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
