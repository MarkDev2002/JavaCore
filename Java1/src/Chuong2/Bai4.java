package Chuong2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {

        SinhVien sv1 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.print("MSSV: ");
        sv1.setMaSV(sc.next());
        sc.nextLine();
        System.out.print("TENSV: ");
        sv1.setTenSV(sc.nextLine());
        System.out.print("DLT: ");
        sv1.setDiemTL(sc.nextFloat());
        System.out.print("DTH: ");
        sv1.setDiemTH(sc.nextFloat());

        System.out.printf("%6s %10s %20s %10s %10s \n", "MSSV", "Ho Ten", "DLT", "DTH", "DTB");
        sv1.inSV();
        System.out.println("--------------------------end-----------------------------");
    }
}