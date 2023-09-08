package SimpleCode.OOPBasic.Inheritance;

public class Reactangle {
    protected double cd;
    protected double cr;

    public Reactangle(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public double getCr() {
        return cr;
    }

    public double getChuVi() {
        return (cd + cr) * 2;
    }

    public double getDienTich() {
        return cd * cr;
    }

    public void Output() {
        System.out.printf("Chu vi hình chữ nhật là : %.2f | Chu vi HCN là : %.2f", getChuVi(), getDienTich());
    }
}
