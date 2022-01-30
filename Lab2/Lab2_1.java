import java.util.Scanner;

public class Lab2_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int t = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int f = in.nextInt();
        String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Today is "+day[t]+" and the future day is "+day[(t+f)%7]);
        in.close();
    }
}