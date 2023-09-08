package Chuong3;

public class TestDongVat {
    public static void main(String[] args) {
        DongVat dv1 = new DongVat();
        DongVat dv2 = new Meo();
        dv1.nhap();
        System.out.printf("%-20s %-20s %-20s %-20s", "Tên", "ChieuCao", "CanNang", "SoChan");
        dv1.xuat();
        dv1.An();
        dv2.An();
        dv1.Keu();
        dv2.Keu();
        dv1.xuat();
    }
}
