package SimpleCode;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n - 1; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n : ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không là số nguyên tố");
        }
    }
}
