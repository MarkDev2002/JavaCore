package Chuong3;

import java.util.Scanner;

public class DongVat {
    static Scanner sc = new Scanner(System.in);
    protected String tendongvat;
    protected double ChieuCao;
    protected double CanNang;
    protected String tiengkeu;
    protected String thucan;
    protected int sochan;

    public DongVat() {
        tendongvat = null;
        ChieuCao = 0;
        CanNang = 0;
        tiengkeu = null;
        thucan = null;
        sochan = 0;
    }

    public DongVat(String tendongvat, double chieuCao, double canNang, String tiengkeu, String thucan, int sochan) {
        this.tendongvat = tendongvat;
        ChieuCao = chieuCao;
        CanNang = canNang;
        this.tiengkeu = tiengkeu;
        this.thucan = thucan;
        this.sochan = sochan;
    }

    public String getTendongvat() {
        return tendongvat;
    }

    public void setTendongvat(String tendongvat) {
        this.tendongvat = tendongvat;
    }

    public double getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(double chieuCao) {
        ChieuCao = chieuCao;
    }

    public double getCanNang() {
        return CanNang;
    }

    public void setCanNang(double canNang) {
        CanNang = canNang;
    }

    public String getTiengkeu() {
        return tiengkeu;
    }

    public void setTiengkeu(String tiengkeu) {
        this.tiengkeu = tiengkeu;
    }

    public String getThucan() {
        return thucan;
    }

    public void setThucan(String thucan) {
        this.thucan = thucan;
    }

    public int getSochan() {
        return sochan;
    }

    public void setSochan(int sochan) {
        this.sochan = sochan;
    }

    public void nhap() {
        System.out.println("Nhap ten dong vat : ");
        tendongvat = sc.nextLine();
        System.out.println("Nhap chieu cao (cm) : ");
        ChieuCao = sc.nextDouble();
        System.out.println("Can nang (kg) : ");
        CanNang = sc.nextDouble();
        System.out.println("So chan : ");
        sochan = sc.nextInt();
    }

    public void xuat() {

        System.out.printf("%-20s %-20f %-20f %-20s", tendongvat, ChieuCao, CanNang, sochan);
    }

    public void An() {
        System.out.println("An gi day : ");
    }

    public void Keu() {
        System.out.println("Keu sao day : ");
    }
}