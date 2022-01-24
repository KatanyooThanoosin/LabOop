import java.util.Scanner;
import java.util.Arrays;

public class Lab3_2 {
    public static int[] merge(int[] a, int[] b) {
        int[] m = new int[a.length + b.length];
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            m[n] = a[i];
            n++;
        }
        for (int i = 0; i < b.length; i++) {
            m[n] = b[i];
            n++;
        }
        Arrays.sort(m);
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter list1: ");
        String[] aString = in.nextLine().split(" ");
        int[] a = new int[aString.length];
        for (int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(aString[i]);

        System.out.print("Enter list2: ");
        String[] bString = in.nextLine().split(" ");
        int[] b = new int[bString.length];
        for (int i = 0; i < bString.length; i++)
            b[i] = Integer.parseInt(bString[i]);

        int[] m = merge(a, b);
        System.out.print("The merged list is ");
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] + " ");
    }
}
// 1 5 16 61 111
// 2 4 5 6