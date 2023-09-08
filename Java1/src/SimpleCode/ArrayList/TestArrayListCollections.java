package SimpleCode.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayListCollections {
    private final ArrayList<String> ds = new ArrayList<>();

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử a[" + i + "] : ");
            String input = String.valueOf(sc.nextLine());
            ds.add(input);
        }
    }

    public void Output() {
        System.out.print("Danh sách họ tên : ");
        for (String item : ds) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    public void xuatNgauNhien() {
        Collections.shuffle(ds);
        Output();
    }

    public void SortAlphabet() {
        Collections.sort(ds);
    }

    public void findAndRemove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên cần xóa : ");
        String hoten = String.valueOf(sc.nextLine());
        for (String item : ds) {
            if (hoten.equals(item)) {
                ds.remove(item);
                break;
            }
        }
    }

    public void Menu() {
        int choice = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("--------------------------------------");
                System.out.println("1. Nhập danh sách");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Sắp xếp danh sách");
                System.out.println("4. Xuất ngẫu nhiên");
                System.out.println("5. Tìm và xóa");
                System.out.println("6. Thoát chương trình");
                System.out.println("--------------------------------------");

                System.out.print("Nhập lựa chọn của bạn : ");
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 6) {
                    System.out.println("Không hợp lệ!!!");
                    choice = 6;
                } else {
                    switch (choice) {
                        case 1 -> Input();
                        case 2 -> Output();
                        case 3 -> SortAlphabet();
                        case 4 -> xuatNgauNhien();
                        case 5 -> findAndRemove();
                        case 6 -> System.exit(0);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le : " + e.getMessage());
            }
        } while (choice != 6);
    }
}

