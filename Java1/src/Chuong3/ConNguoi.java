package Chuong3;

import java.util.Scanner;

public class ConNguoi extends DiaChi {
    static Scanner sc = new Scanner(System.in);
    private String hoten;
    private String Date;
    private String ID;

    public ConNguoi() {
        super();
        hoten = null;
        Date = null;
        ID = null;
    }

    public ConNguoi(String sonha, String duong, String quan, String thanhpho, String hoten, String Date, String ID) {
        super(sonha, duong, quan, thanhpho);
        this.hoten = hoten;
        this.Date = Date;
        this.ID = ID;
    }

    public static void main(String[] args) {
        ConNguoi cn = new ConNguoi();
        cn.Nhap();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", "HoTen", "NgaySinh", "CMND", "SoNha", "Duong", "Quan", "TP");
        System.out.println("");
        cn.HienThi();
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDate() {
        return Date;
    }

    public void setDateofBirth(String Date) {
        Date = Date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void Nhap() {
        System.out.println("Nhap ho ten : ");
        hoten = sc.nextLine();
        System.out.println("Ngay sinh : ");
        Date = sc.nextLine();
        System.out.println("Nhap cmnd : ");
        ID = sc.nextLine();
        super.Nhap();
    }

    public void HienThi() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", hoten, Date, ID, getSonha(), getDuong(), getQuan(), getThanhpho());
    }
}
