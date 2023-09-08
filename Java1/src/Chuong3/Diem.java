package Chuong3;

import java.util.Scanner;

public class Diem {
    static Scanner sc = new Scanner(System.in);
    private int x;
    private int y;

    public Diem() {
        x = 0;
        y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void NhapDiem() {
        System.out.println("Nhap vao hoanh do x : ");
        x = sc.nextInt();
        System.out.println("Nhap vao tung do y : ");
        y = sc.nextInt();
    }

    public void HienThi() {
        System.out.print("(" + x + " , " + y + ")");
    }
}
