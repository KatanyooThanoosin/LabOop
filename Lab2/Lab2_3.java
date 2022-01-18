import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date: ");
        int q = in.nextInt();

        System.out.print("Enter month: ");
        int m = in.nextInt();

        System.out.print("Enter year: ");
        int year = in.nextInt();

        if (m < 3) {
            m += 12;
            year-=1;
        }

        int k = year % 100;
        int j = year / 100;
        String[] day = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        System.out.println(day[(q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7]);
    }
}