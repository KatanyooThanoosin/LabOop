import java.util.Scanner;

public class lab8_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 3 sides of the triangle: ");
        double[] side = new double[3];
        for(int i = 0; i < 3; i++) {
            side[i] = in.nextDouble();
        }
        Triangle triangle = new Triangle(side[0],side[1],side[2]);
        System.out.print("The color is: ");
        String color = in.next();
        triangle.setColor(color);
        System.out.print("The triangle is filled (y/n): ");
        String f = in.next();
        if(f.equals("y"))triangle.setFilled(true);
        else if(f.equals("n"))triangle.setFilled(false);
        System.out.println("----------------------------");
        System.out.println(triangle.toString());
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("Triangle is filled: " + triangle.isFilled());
        in.close();
    }
}