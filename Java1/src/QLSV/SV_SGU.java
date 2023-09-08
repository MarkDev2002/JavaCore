package QLSV;

public class SV_SGU extends SinhVien {
    private double diemJava;

    public SV_SGU(int MSSV, String ten, int namSinh, double diemCSharp, double diemJava) {
        super(MSSV, ten, namSinh, diemCSharp);
        this.diemJava = diemJava;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem Java : " + getDiemJava());
    }
}
