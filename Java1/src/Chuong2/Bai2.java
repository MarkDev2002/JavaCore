package Chuong2;

import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    private double d;
    private double r;

    public void Nhap() {
        System.out.print("Nhap chieu dai : ");
        d = sc.nextDouble();
        System.out.print("Nhap chieu rong : ");
        r = sc.nextDouble();
    }

    public double ChuVi() {
        return (d + r) * 2;
    }

    public double DienTich() {
        return d * r;
    }

    public static void main(String[] args) {
        Bai2 test = new Bai2();
        test.Nhap();
        System.out.print("Chu vi cua hinh chu nhat : " + test.ChuVi());
        System.out.print("Dien tich cua hinh chu nhat : " + test.DienTich());
    }

}
