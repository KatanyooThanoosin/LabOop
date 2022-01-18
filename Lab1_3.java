import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000:");
        int n = in.nextInt();
        System.out.println("The sum of the digits is "+(n%10+(n/10)%10+(n/100)%10+n/1000));
    }
}