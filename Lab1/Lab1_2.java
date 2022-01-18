import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();
        System.out.println("x = "+((e*d-b*f)/(a*d-b*c)));
        System.out.println("y = "+((a*f-e*c)/(a*d-b*c)));
    }
}