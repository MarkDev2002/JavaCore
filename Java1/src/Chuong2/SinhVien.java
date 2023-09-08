package Chuong2;

public class SinhVien {
    private String maSV;
    private String tenSV;
    private float diemTL, diemTH;

    public SinhVien() {
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }


    public void setDiemTL(float diemTL) {
        this.diemTL = diemTL;
    }


    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }


    public float tinhDiemTB() {
        return (diemTH + diemTL) / 2;
    }


    public String toString() {
        return maSV + " - " + tenSV + " diem Tb : " + tinhDiemTB();
    }


    public void inSV() {
        System.out.printf("%11s %-20s %8.2f %8.2f %8.2f \n", maSV, tenSV, diemTH, diemTL, tinhDiemTB());
    }
}