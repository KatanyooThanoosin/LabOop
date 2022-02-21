public class Triangle extends GeometricObject {

    // Attributes
    private double[] side = new double[3];

    // Constructors
    public Triangle(String color, boolean filled, double[] side) {
        super(color, filled);
        this.side = side;
    }

    // Methods
    public double getArea() {
        double s = (this.side[0] + this.side[1] + this.side[2]) / 2;
        return Math.sqrt(s * (s - this.side[0]) * (s - this.side[1]) * (s - this.side[2]));
    }

    public double getPerimeter() {
        return this.side[0] + this.side[1] + this.side[2];
    }
}