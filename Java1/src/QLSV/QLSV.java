package QLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    private Scanner sc;
    private ArrayList<SinhVien> _list;

    public QLSV() {
        _list = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void Add() {
        String choice;
        do {
            _list.add(new SinhVien(Integer.parseInt(getValue("ma sinh vien : ")), getValue("ten sinh vien : "), Integer.parseInt(getValue("nam sinh : ")), Double.parseDouble(getValue("diem C Sharp : "))));
            System.out.println();
            choice = sc.nextLine();
            System.out.println("Nhap 1 de tiep tuc them sinh vien");
            System.out.println("Khac 1 de thoat chuc nang");

        } while (choice.equals("1"));
    }

    public void show() {
        if (_list.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!!!");
        } else {
            System.out.println("Danh sach sinh vien : ");
            int count = 1;
            for (SinhVien sinhvien : _list) {
                System.out.println("Sinh vien thu " + count);
                sinhvien.inThongTin();
                count++;
            }
        }
    }

    public void showPass() {
        if (_list.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!!!");
        } else {
            System.out.println("Danh sach sinh vien : ");
            int count = 0;
            for (SinhVien sinhvien : _list) {
                if (sinhvien.getDiemCSharp() >= 5.0) {
                    count++;
                    System.out.println("Sinh vien thu" + count);
                    sinhvien.inThongTin();
                }
            }
            if (count == 0) {
                System.out.print("Khong co sinh vien nao qua mon C#");
            }
        }
    }

    public void showSearch() {
        if (_list.isEmpty()) {
            System.out.println("Danh sach sinh vien trong!!!");
        } else {
            int mssv = Integer.parseInt(getValue("Ma sinh vien can tim : "));
            for (SinhVien sinhvien : _list) {
                if (sinhvien.getMSSV() == mssv) {
                    System.out.println("Sinh vien can tim la : ");
                    sinhvien.inThongTin();
                    return;
                }
            }
            System.out.println("Khong tim thay sinh vien nao co ma : " + mssv);
        }
    }


    public void KeThua() {
        System.out.println("Nhap vao thong tin sinh vien SGU!!");
        SV_SGU sgu = new SV_SGU(Integer.parseInt(getValue("ma sinh vien : ")), getValue("ten sinh vien : "), Integer.parseInt(getValue("nam sinh : ")), Double.parseDouble(getValue("diem C# : ")), Double.parseDouble(getValue("diem Java : ")));
        System.out.println("Thong tin sinh vuen SGU vua nhap la : ");
        sgu.inThongTin();
    }

    private String getValue(String x) {
        System.out.print("Nhap vao " + x);
        return sc.nextLine();
    }
}
