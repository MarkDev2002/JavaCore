package Chuong2;

import java.util.Scanner;

public class Bai3 {
    private double r;

    public Bai3(double r) {
        this.r = r;
    }

    public double ChuVi() {
        return 2 * 3.14 * r;
    }

    public double DienTich() {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron : ");
        double r = sc.nextDouble();
        Bai3 pt = new Bai3(r);
        System.out.print("Chu vi cua hinh tron = " + pt.ChuVi());
        System.out.print("Dien tich cua hinh tron = " + pt.DienTich());
    }
}