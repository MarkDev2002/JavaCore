package Chuong3;

import java.util.Scanner;

public class DiemMau extends Diem {
    private String Color;

    public DiemMau() {
        super();
        Color = null;
    }

    public DiemMau(int x, int y, String Color) {
        super(x, y);
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public void NhapDiem() {
        Scanner sc = new Scanner(System.in);
        super.NhapDiem();
        System.out.print("Nhap mau : ");
        Color = sc.nextLine();
    }

    @Override
    public void HienThi() {
        super.HienThi();
        System.out.print(" , " + Color);
    }
}
