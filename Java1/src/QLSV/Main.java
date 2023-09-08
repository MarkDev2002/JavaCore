package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        QLSV qlsv = new QLSV();
        do {
            System.out.println("|====================Menu=================|");
            System.out.println("| 1 . Them sinh vien                      |");
            System.out.println("| 2 . Xuat danh sach                      |");
            System.out.println("| 3 . Xuat qua mon                        |");
            System.out.println("| 4 . Tim sinh vien                       |");
            System.out.println("| 5 . Ke thua                             |");
            System.out.println("| 0 . Exit                                |");
            System.out.println("|=========================================|");
            System.out.print("Chon chuc nang : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> qlsv.Add();
                case 2 -> qlsv.show();
                case 3 -> qlsv.showPass();
                case 4 -> qlsv.showSearch();
                case 5 -> qlsv.KeThua();
                case 0 -> System.out.println("Thoat thanh cong!!!");
                default -> System.out.println("Yeu cau nhap lai chuc nang!!!");
            }
        } while (choice != 0);

    }
}
