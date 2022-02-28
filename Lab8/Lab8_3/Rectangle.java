public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    // Attributes
    private double width;
    private double height;

    // Constructors
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    // Methods
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public int compareTo(Rectangle tmp) {
        if (this.getArea() < tmp.getArea()) {
            return -1;
        } else if (this.getArea() == tmp.getArea()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Rectangle)o) == 0;
    }
}