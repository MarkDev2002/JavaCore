package SimpleCode.ArrayList;

import java.util.Scanner;

public class Cellphones {
    private String tenSP;
    private double donGia;
    private String company;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên điện thoại : ");
        tenSP = String.valueOf(sc.nextLine());
        System.out.print("Nhập giá : ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập tên hãng : ");
        company = String.valueOf(sc.nextLine());
    }

    public void Output() {
        System.out.println("-------------------");
        System.out.printf("Tên sản phẩm : %s - Giá : %.2f - Hãng : %s", tenSP, donGia, company);
    }
}
