import java.util.Scanner;

public class Lab8_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        double[] side = new double[3];

        for (int i = 0; i < 3 && flag; i++) {
            System.out.print("Enter side" + (i + 1) + ": ");
            side[i] = in.nextDouble();
            while (side[i] <= 0) {
                System.out.println("ERROR::Sides should be positive.");
                flag = false;
            }
        }

        if (flag) {
            System.out.print("Enter color: ");
            String color = in.next();
            System.out.print("Enter is the triangle filled?: ");
            Boolean filled = in.nextBoolean();
            Triangle triangle = new Triangle(color, filled, side);

            System.out.println("Area of triangle is " + triangle.getArea());
            System.out.println("Perimeter of triangle is " + triangle.getPerimeter());
            System.out.println("Color of triangle is " + triangle.getColor());
            System.out.println("Is triangle filled? : " + triangle.isFilled());
        }

        in.close();
    }
}