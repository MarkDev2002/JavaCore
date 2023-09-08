package QLSV;

public class SinhVien {
    private int MSSV;
    private String Ten;
    private int NamSinh;
    private double DiemCSharp;

    public SinhVien(int MSSV, String ten, int namSinh, double diemCSharp) {
        this.MSSV = MSSV;
        Ten = ten;
        NamSinh = namSinh;
        DiemCSharp = diemCSharp;
    }

    public int getMSSV() {
        return MSSV;
    }

    public void setMSSV(int MSSV) {
        this.MSSV = MSSV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public double getDiemCSharp() {
        return DiemCSharp;
    }

    public void setDiemCSharp(double diemCSharp) {
        DiemCSharp = diemCSharp;
    }

    public void inThongTin() {
        System.out.println("Ma sinh vien : " + getMSSV());
        System.out.println("Ten sinh vien : " + getTen());
        System.out.println("Nam sinh : " + getNamSinh());
        System.out.println("Diem C# : " + getDiemCSharp());
    }
}
