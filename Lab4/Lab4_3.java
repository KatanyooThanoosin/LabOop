class StopWatch{
    
    //Attributes
    private long startTime;
    private long endTime;

    //constructor
    public StopWatch(){
        this.startTime = System.nanoTime();
    }

    //Method
    public void start(){
        this.startTime = System.nanoTime();
    }
    public void stop(){
        this.endTime = System.nanoTime();
    }
    public double getElapsedTime(){
        return (this.endTime - this.startTime)/1000000.0;
    }
}

public class Lab4_3 {
    public static void selectionSort(double[] a){
        for(int i=0;i<a.length-1;i++){
            int in=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[in]){
                    in = j;
                }
            }

            if(in!=i){
                double tmp = a[in];
                a[in] = a[i];
                a[i] = tmp;
            }
        }
    }
    public static boolean isPalinDrome(int n){
        int sum=0;
        int a=n;
        while(a>0){
            sum = sum*10+a%10;
            a/=10;
        }
        return n==sum;
    }
    public static boolean isPrimeNumber(int n){
        for(int i = 2; i*i <=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        StopWatch w = new StopWatch();
        System.out.println("Creating a list containing 1000 elements,");
        double[] a = new double[1000];
        for(int i=0; i<a.length; i++){
            a[i] = Math.random()*1000;
            System.out.printf("\t%.2f",a[i]);
            if((i+1)%5==0)System.out.println();
        }
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        w.start();
        selectionSort(a);
        for(int i=0; i<a.length; i++){
            System.out.printf("\t%.2f",a[i]);
            if((i+1)%5==0)System.out.println();
        }
        w.stop();
        System.out.println("Sorting stopwatch stoped.");
        System.out.println("The sort time is "+w.getElapsedTime()+" milliseconds.");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        w.start();
        System.out.println("Creating 100 PalindromPrime...");
        int n = 0;
        int i = 2;
        while(n<1000){
            if(isPalinDrome(i)){
                if(isPrimeNumber(i)){
                    System.out.print(i+" ");
                    n++;
                    if(n%5==0&&n>0)System.out.println();
                }
            }
            i++;
        }
        System.out.println("PalindromePrime created.");
        w.stop();
        System.out.println("The palindromPrime stopwatch stoped.");
        System.out.println("The palindromPrime time is "+w.getElapsedTime()+" milliseconds.");
    }
}