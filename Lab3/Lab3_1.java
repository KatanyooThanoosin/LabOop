public class Lab3_1 {
    public static boolean prime(int n) {
        int m = n / 2;
        for (int i = 2; i <= m; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean palindrome(int n) {
        int tmp = n;
        int sum = 0;
        int r;

        while (tmp > 0) {
            r = tmp % 10;
            sum = (sum * 10) + r;
            tmp /= 10;
        }

        return n == sum;
    }

    public static void main(String[] args) {
        int i = 0;
        int n = 2;
        while (i < 100) {
            if (palindrome(n)) {
                if (prime(n)) {
                    System.out.print(n + " ");
                    i++;
                    if (i != 0 && i % 10 == 0)
                        System.out.println("");
                }
            }
            n++;
        }
    }

}