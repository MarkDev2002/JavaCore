package Chuong2;

import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    private int x;
    private int y;

    public void Nhap() {
        System.out.println("Nhap toa do x : ");
        x = sc.nextInt();
        System.out.println("Nhap toa do y : ");
        y = sc.nextInt();
    }

    public void Move() {
        System.out.print("Nhap toa x muon di chuyen toi : ");
        int newx = sc.nextInt();
        System.out.print("Nhap toa y muon di chuyen toi : ");
        int newy = sc.nextInt();
        x = newx;
        y = newy;
    }

    public void Xuat() {
        System.out.print("Toa do x : " + this.x);
        System.out.print("Toa do y : " + this.y);
    }

    public static void main(String[] args) {
        Bai1 test = new Bai1();
        test.Nhap();
        test.Xuat();
        test.Move();
        System.out.print("\nToa do x va y sau khi di chuyen la : ");
        test.Xuat();
    }

}
