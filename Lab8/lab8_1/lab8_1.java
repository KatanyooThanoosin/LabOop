import java.util.Scanner;

public class lab8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side1 : ");
        double side1 = in.nextDouble();
        while (side1 <= 0) {
            System.out.print("ERROR::Side should be positive\nEnter side1 again: ");
            side1 = in.nextDouble();
        }
        System.out.print("Enter side2 : ");
        double side2 = in.nextDouble();
        while (side2 <= 0) {
            System.out.print("ERROR::Side should be positive\nEnter side2 again: ");
            side2 = in.nextDouble();
        }
        System.out.print("Enter side3 : ");
        double side3 = in.nextDouble();
        while (side3 <= 0) {
            System.out.print("ERROR::Side should be positive\nEnter side3 again: ");
            side3 = in.nextDouble();
        }
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.print("Enter is the triangle filled?: ");
        Boolean filled = in.nextBoolean();
        String color;
        if (filled) {
            System.out.print("Enter color: ");
            color = in.next();
        } else
            color = null;
        triangle.setFilled(filled);
        triangle.setColor(color);
        in.close();

        GeometricObject.displayObject(triangle);
    }
}