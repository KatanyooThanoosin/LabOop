public class Circle extends GeometricObject {

    // Attributes
    private double r = 1;

    // Constructors
    public Circle() {
        super();
    }

    public Circle(double r) {
        super();
        this.r = r;
    }

    // Methods
    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPerimeter() {
        return Math.PI * r * 2;
    }

    public double getDiameter() {
        return r * 2;
    }

    @Override
    public String toString() {
        return "Circle: r = " + this.r;
    }
}