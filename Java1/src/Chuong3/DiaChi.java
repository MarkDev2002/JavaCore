package Chuong3;

import java.util.Scanner;

public class DiaChi {
    static Scanner sc = new Scanner(System.in);
    private String sonha;
    private String duong;
    private String quan;
    private String thanhpho;

    public DiaChi() {
        sonha = null;
        duong = null;
        quan = null;
        thanhpho = null;
    }

    public DiaChi(String sonha, String duong, String quan, String thanhpho) {
        this.sonha = sonha;
        this.duong = duong;
        this.quan = quan;
        this.thanhpho = thanhpho;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getDuong() {
        return duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public void Nhap() {
        System.out.println("Nhap so nha : ");
        sonha = sc.nextLine();
        System.out.println("Nhap ten duong : ");
        duong = sc.nextLine();
        System.out.println("Nhap ten quan : ");
        quan = sc.nextLine();
        System.out.println("Thanh Pho : ");
        thanhpho = sc.nextLine();
    }

    public void HienThi() {
        System.out.printf("%-20s %-20s %-20s %-20s", sonha, duong, quan, thanhpho);
    }
}
