import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float w = in.nextFloat();
        System.out.print("Enter height in inches: ");
        float h = in.nextFloat();
        h*=0.0254;
        w*=0.45359237;
        System.out.print("BMI is "+(w/(h*h)));
        in.close();
    }
}