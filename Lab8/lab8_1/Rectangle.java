public class Rectangle extends GeometricObject {

    // Attributes
    private double w = 1;
    private double h = 1;

    // Constructors
    public Rectangle() {
        super();
    }

    public Rectangle(double w, double h) {
        super();
        this.w = w;
        this.h = h;
    }

    // Methods
    public double getWidth() {
        return w;
    }

    public double getHeight() {
        return h;
    }

    public double getArea() {
        return w * h;
    }

    public double getPerimeter() {
        return w + w + h + h;
    }

    @Override
    public String toString() {
        return "Rectangle: w = " + w +
                " h = " + h;
    }
}