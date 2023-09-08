package SimpleTest;

import java.util.Scanner;

public class UCLN_BCNN {

    public static int Nhap() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                sc.nextLine();
            }
        }
        return (n);
    }

    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return (a);
    }

    public static void main(String[] args) {
        System.out.print("Nhap a : ");
        int a = Nhap();
        System.out.print("Nhap b : ");
        int b = Nhap();
        System.out.print("Uoc chung lon nhat cua " + a + " va " + b + " la: " + UCLN(a, b));
        System.out.print("\nBoi chung nho nhat cua " + a + " va " + b + " la: " + ((a * b) / UCLN(a, b)));
    }

}
