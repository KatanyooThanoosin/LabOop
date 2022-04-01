public class Triangle extends GeometricObject {

    // Attributes
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    // Constructors
    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Methods
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + this.side1 +
                " side2 = " + this.side2 +
                " side3 = " + this.side3;
    }
}