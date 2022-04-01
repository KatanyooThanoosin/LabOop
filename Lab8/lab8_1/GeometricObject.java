import java.util.Date;

public abstract class GeometricObject {

    // Attributes
    private String color;
    private boolean filled;
    private Date dateCreated;

    // Constructors
    protected GeometricObject() {
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
    }

    // Methods
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{color=" + this.color +
                ",filled=" + this.filled +
                ",dateCreated=" + this.dateCreated + "} ";
    }

    public static void displayObject(Object Object) {
        if (Object instanceof Triangle triangle) {
            System.out.println("Area of triangle is " + triangle.getArea());
            System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
            System.out.println("Color of triangle is " + triangle.getColor());
            System.out.println("Is triangle filled? : " + triangle.isFilled());
        } else if (Object instanceof Circle circle) {
            System.out.println("Area of circle is " + circle.getArea());
            System.out.println("Perimeter of circle is " + circle.getPerimeter());
            System.out.println("Diameter of circle is " + circle.getDiameter());
        } else if (Object instanceof Rectangle rectangle) {
            System.out.println("Width of rectangle is " + rectangle.getWidth());
            System.out.println("Height of rectangle is " + rectangle.getHeight());
            System.out.println("Area of rectangle is " + rectangle.getArea());
            System.out.println("Perimeter of rectangle is " + rectangle.getPerimeter());
        }
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}