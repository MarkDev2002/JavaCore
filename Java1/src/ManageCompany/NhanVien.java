package ManageCompany;

public abstract class NhanVien {

    protected String ID;
    protected String hoTen;
    protected double luongCoBan;
    protected String phongBan;

    public NhanVien(String ID, String hoTen, double luongCoBan, String phongBan) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.phongBan = phongBan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    abstract double getLuong();
}
