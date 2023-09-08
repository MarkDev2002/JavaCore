package Chuong2;

import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Bai6 {
    private int n;

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n : ");
        n = sc.nextInt();
    }

    public void UocSo() {
        System.out.print("Uoc so chung cua " + n + " la : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public boolean Prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean PerfectSquare(int x) {

        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }

    public void KtraSNT() {
        if (Prime(n)) {
            System.out.print(n + " la so nguyen to");
        } else {
            System.out.print(n + " khong la so nguyen to");
        }
    }

    public void KtrSCP() {
        if (PerfectSquare(n)) {
            System.out.print(n + " la so chinh phuong");
        } else {
            System.out.print(n + " khong la so chinh phuong");
        }
    }

    public void PerfectNumber() {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n) {
            System.out.print(n + " la so hoan hao");
        } else {
            System.out.print(n + " khong la so hoan hao");
        }
    }

    public static void main(String[] args) {
        Bai6 test = new Bai6();
        test.Nhap();
        test.UocSo();
        System.out.println("\n-----------------");
        test.KtraSNT();
        System.out.println("\n-----------------");
        test.KtrSCP();
        System.out.println("\n-----------------");
        test.PerfectNumber();
        System.out.println("\n-----------------");
    }
}
