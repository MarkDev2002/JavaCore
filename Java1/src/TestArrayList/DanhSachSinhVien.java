package TestArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSinhVien {

    private final ArrayList<String> ds = new ArrayList<>();

    public void inputData() {
        ds.clear();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách (To stop please press 0!!!)");
        while (true) {
            System.out.print("Nhập họ tên : ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("0")) {
                System.out.println("Nhập dữ liệu thành công!!");
                break;
            }

            ds.add(name);
        }

    }

    public void outputData() {
        System.out.println("Danh sách gồm");
        System.out.println("--------------------------");
        for (String item : ds) {
            System.out.println(item);
        }
    }

    public void outputRandom() {
        Collections.shuffle(ds);
        outputData();
    }

    public void outputDesc() {
        Collections.sort(ds);
        Collections.reverse(ds);
        outputData();
    }

    public void findByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên cần tìm kiếm : ");
        String hoTen = sc.nextLine();
        for (String item : ds) {
            if (item.equalsIgnoreCase(hoTen)) {
                System.out.println("Đã tìm thấy " + hoTen + " : ");
                System.out.println(item);
                break;
            } else {
                System.out.println("Can't find!!");
            }
        }
    }

    public void delByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên muốn xóa : ");
        String hoTen = sc.nextLine();

        for (String item : ds) {
            if (item.equalsIgnoreCase(hoTen)) {
                ds.remove(item);
                System.out.println("Xóa họ tên thành công!!!");
                break;
            }
        }
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1.Nhập danh sách họ tên");
            System.out.println("2.Hiển thị danh sách");
            System.out.println("3.Xuất ngẫu nhiên");
            System.out.println("4.Sắp xếp giảm dần");
            System.out.println("5.Tìm kiếm");
            System.out.println("6.Xóa theo tìm kiếm");
            System.out.println("0.Thoát");

            System.out.print("\nNhập lựa chọn : ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0:
                    break;
                case 1:
                    inputData();
                    break;
                case 2:
                    outputData();
                    break;
                case 3:
                    outputRandom();
                    break;
                case 4:
                    outputDesc();
                    break;
                case 5:
                    findByName();
                    break;
                case 6:
                    delByName();
                    break;
                default:
                    System.out.println("Error!!");
            }
        } while (choice != 0);
    }
}
