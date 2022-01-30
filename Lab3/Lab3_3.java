import java.util.Scanner;

public class Lab3_3 {
    public static void check(int[][] a,int n) {
        //row
        boolean p = true;
        for(int i=0;i<n;i++){
            boolean f = true;
            
            //0
            for(int j=0;j<n&&f;j++)if(a[i][j] == 1)f = false;
            if(f){
                System.out.println("All 0s on row "+i);
                p=false;
            }
        }
        for(int i=0;i<n;i++){
            //1
            boolean f=true;
            for(int j=0;j<n&&f;j++)if(a[i][j] ==0)f = false;
            if(f){
                System.out.println("All 1s on row "+i);
                p=false;
            }
        }
        if(p)System.out.println("No same numbers on a row");

        //column
        p=true;
        for(int i=0;i<n;i++){
            boolean f = true;
            
            //0
            for(int j=0;j<n&&f;j++)if(a[j][i] == 1)f = false;
            if(f){
                System.out.println("All 0s on column "+i);
                p=false;
            }
        }
        for(int i=0;i<n;i++){
            boolean f = true;
            //1
            for(int j=0;j<n&&f;j++)if(a[j][i] ==0)f = false;
            if(f){
                System.out.println("All 1s on column "+i);
                p=false;
            }
        }
        if(p)System.out.println("No same numbers on a column");
        
        //superDiagonal
        p=true;
        //0
        boolean b=true;
        for(int i=0;i<n-1&&b;i++){
            if(a[i][i+1] == 1){
                b = false;
            }
        }
        if(b){
            System.out.println("All 0s on the superdiagonal");
            p=false;
        }
        //1
        b = true;
        for(int i=0;i<n-1&&b;i++){
            if(a[i][i+1] == 0){
                b = false;
            }
        }
        if(b){
            System.out.println("All 1s on the superdiagonal");
            p=false;
        }
        if(p)System.out.println("No same numbers on the superdiagonal");

        //diagonal
        p=true;
        //0
        b=true;
        for(int i=0;i<n&&b;i++){
            if(a[i][i] == 1){
                b = false;
            }
        }
        if(b){
            System.out.println("All 0s on the diagonal");
            p=false;
        }
        //1
        b=true;
        for(int i=0;i<n&&b;i++){
            if(a[i][i] == 0){
                b = false;
            }
        }
        if(b){
            System.out.println("All 1s on the diagonal");
            p=false;
        }
        if(p)System.out.println("No same numbers on the diagonal");

        //subDiagonal
        p=true;
        //0
        b=true;
        for(int i=0;i<n-1&&b;i++){
            if(a[i+1][i] == 1){
                b = false;
            }
        }
        if(b){
            System.out.println("All 0s on the subdiagonal");
            p=false;
        }
        //1
        b=true;
        for(int i=0;i<n-1&&b;i++){
            if(a[i+1][i] == 0){
                b = false;
            }
        }
        if(b){
            System.out.println("All 1s on the subdiagonal");
            p=false;
        }
        if(p)System.out.println("No same numbers on the subdiagonal");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = (int)(Math.random()*2);
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
        check(a, n);
        in.close();
    }
}
