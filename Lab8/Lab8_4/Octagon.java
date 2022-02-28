public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    // Atrributes
    private double side;

    // Constructors
    public Octagon(double side) {
        super();
        this.side = side;
    }

    // Methods
    @Override
    public double getPerimeter() {
        return 8 * this.side;
    }

    @Override
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * this.side * this.side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (this.getArea() == o.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Octagon clone() {
        Octagon clone = new Octagon(this.side);
        return clone;
    }
}
