import java.util.Scanner;

public class Lab2_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)System.out.print("  ");
            for(int k=i;k>=2;k--)System.out.print(k+" ");
            for(int l=1;l<=i;l++)System.out.print(l+" ");
            System.out.println();
        }
    }
}
