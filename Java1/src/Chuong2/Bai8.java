package Chuong2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai8 {
    static Scanner sc = new Scanner(System.in);
    private String a;

    public Bai8() {
        a = null;
    }

    public Bai8(String a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Bai8 test = new Bai8();
        test.nhap();
        System.out.println("------------------------------");
        test.InKiTu();
        System.out.println("------------------------------");
        test.InHoaChuoi();
        System.out.println("------------------------------");
        test.InThuongChuoi();
        System.out.println("------------------------------");
        test.XoaKhoangTrangThua();
        System.out.println("------------------------------");
        test.DemSoKhoangTrang();
        System.out.println("------------------------------");
        test.DemSoTu();
        System.out.println("------------------------------");
        test.XuatNguoc();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void nhap() {
        System.out.println("Nhap chuoi : ");
        a = sc.nextLine();
    }

    public void InKiTu() {
        System.out.println("Ki tu dau cua chuoi la : " + a.charAt(0));
        System.out.println("Ki tu cuoi cung cua chuoi la : " + a.charAt(a.length() - 1));
    }

    public void InHoaChuoi() {
        System.out.println("Chuoi in hoa : " + a.toUpperCase());
    }

    public void InThuongChuoi() {
        System.out.println("Chuoi in thuong : " + a.toLowerCase());
    }

    public void XoaKhoangTrangThua() {
        System.out.print("Chuoi sau khi xoa khoang trang thua : ");
        System.out.println(a.replaceAll("\\s\\s+", " ").trim());
    }

    public void DemSoKhoangTrang() {
        int count = 0;
        char kyTu;
        for (int i = 0; i < a.length(); i++) {
            kyTu = a.charAt(i);
            if (Character.isSpace(kyTu)) {
                count++;
            }
        }
        System.out.println("So luong khoang trang co trong chuoi la : " + count);
    }

    public void DemSoTu() {
        StringTokenizer tokens = new StringTokenizer(a);
        int soTuTrongChuoi = tokens.countTokens();
        System.out.println("So tu co trong chuoi = " + soTuTrongChuoi);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                System.out.println("");
            }
        }
    }

    public void XuatNguoc() {
        String[] n = a.split("\\s+");
        System.out.println("Chuoi bi xuat nguoc la : ");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
    }
}
