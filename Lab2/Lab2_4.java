import java.util.Scanner;
import java.util.Arrays;

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] a = new String[3];
        System.out.print("Enter the first city: ");
        a[0] = in.nextLine();
        
        System.out.print("Enter the second city: ");
        a[1]=in.nextLine();

        System.out.print("Enter the third city: ");
        a[2]=in.nextLine();

        Arrays.sort(a);
        System.out.print("The three cities in alphabetical order are "+a[0]+" "+a[1]+" "+a[2]+" ");
    }
}
