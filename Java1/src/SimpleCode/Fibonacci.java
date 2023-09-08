package SimpleCode;


public class Fibonacci {
    public static int Fibo(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("3 số Fibo đầu tiên là : ");
        for (int i = 0; i < 3; i++) {
            System.out.print("" + Fibo(i));
        }
    }
}
