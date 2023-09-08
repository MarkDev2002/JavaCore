package Chuong3;

import java.util.Date;

public class SinhVien extends ConNguoi {
    private String mail, xl, ms;
    private float dtb, a, b, c;
    private int age;

    public SinhVien() {
        super();
        ms = null;
        age = 0;
        mail = null;
        a = 0;
        b = 0;
        c = 0;
    }

    public SinhVien(String mail, String xl, String ms, float a, float b, float c, int age) {
        this.mail = mail;
        this.xl = xl;
        this.ms = ms;
        this.a = a;
        this.b = b;
        this.c = c;
        this.age = age;
    }

    public SinhVien(String sonha, String duong, String quan, String thanhpho, String hoten, String Date, String ID, String mail, String xl, String ms, float a, float b, float c, int age) {
        super(sonha, duong, quan, thanhpho, hoten, Date, ID);
        this.mail = mail;
        this.xl = xl;
        this.ms = ms;
        this.a = a;
        this.b = b;
        this.c = c;
        this.age = age;
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhapSV();
        sv.calTB();
        sv.setRank();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s", "HoTen", "NgaySinh", "CMND", "SoNha ", "Duong", "Quan"
                , "MSSV", "Tuoi", "Mail", "DTB", "XepLoai");
        System.out.println("");
        sv.HienThiSV();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMs() {
        return ms;
    }

    public void setMs(String ms) {
        this.ms = ms;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public void nhapSV() {
        super.Nhap();
        System.out.print("MSSV: ");
        ms = String.valueOf(sc.nextLine());
        System.out.print("Tuoi: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.print("Gmail: ");
        mail = String.valueOf(sc.nextLine());
        System.out.print("Diem mon A: ");
        a = Float.valueOf(sc.nextLine());
        System.out.print("Diem mon B: ");
        b = Float.valueOf(sc.nextLine());
        System.out.print("Diem mon C: ");
        c = Float.valueOf(sc.nextLine());

    }

    public float calTB() {
        dtb = (a + b + c) / 3;
        return (float) Math.round(dtb * 100) / 100;
    }

    public String setRank() {
        if (dtb < 4.0) {
            return xl = "D";
        } else if (dtb < 6.0) {
            return xl = "C";
        } else if (dtb < 8.0) {
            return xl = "B";
        }
        return xl = "A";
    }

    public void HienThiSV() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20f %-20s", getHoten(), getDate(), getID(), getSonha(), getDuong(), getQuan()
                , ms, age, mail, dtb, xl);
    }
}
