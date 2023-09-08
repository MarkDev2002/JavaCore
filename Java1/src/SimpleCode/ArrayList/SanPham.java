package SimpleCode.ArrayList;

import java.util.Scanner;

public class SanPham {
    String tenSp;
    double donGia;
    double Giamgia;
    public double thueNhapKhau() {
        return donGia * 0.1;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        tenSp = String.valueOf(sc.nextLine());
        System.out.print("Nhập đơn giá : ");
        donGia = sc.nextDouble();
        System.out.print("Nhập mã giảm giá : ");
        Giamgia = sc.nextDouble();
    }

    public void Xuat() {
        System.out.println("\n------------------");
        System.out.printf("Tên sản phẩm : %s -- Đơn giá : %.3f -- Mã giảm giá : %.3f -- Thuế nhập khẩu : %.3f", tenSp, donGia, Giamgia, thueNhapKhau());
    }
}
