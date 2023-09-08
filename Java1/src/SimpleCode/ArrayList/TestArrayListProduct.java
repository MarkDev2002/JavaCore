package SimpleCode.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayListProduct {
    private final ArrayList<Product> list = new ArrayList<>();

    public void Input() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Nhập số lượng phần tử : ");
        int n = Integer.parseInt(sc.nextLine());
        do {
            System.out.printf("Tên của sản phẩm thứ %d : ", i + 1);
            String sp = String.valueOf(sc.nextLine());
            if (sp.isEmpty()) {
                break;
            }
            System.out.print("Giá sản phẩm : ");
            double gia = Double.parseDouble(sc.nextLine());
            list.add(new Product(sp, gia));
            i++;
        } while (i < n);
    }

    public void Output() {
        for (Product pr : list) {
            System.out.printf("%20s | %.2f\n", pr.getTen(), pr.getPrice());
        }
    }

    public void Sort() {
        list.sort((a, b) -> (int) (a.getPrice() - b.getPrice()));
        Collections.reverse(list);
        System.out.println("Danh sách sau khi sắp xếp giảm dần : ");
        Output();
    }

    public void FindandRemove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần tìm và xóa : ");
        String f = String.valueOf(sc.nextLine());
        Product found = null;
        for (Product pr : list) {
            if (pr.getTen().equals(f)) {
                found = pr;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
            System.out.println("Sản phẩm đã được xóa khỏi danh sách");
        } else {
            System.out.println("Sản phẩm không có trong danh sách");
        }
    }

    public void GiaTriTRB() {
        double sum = 0;
        for (Product sp : list) {
            sum += sp.getPrice();
        }
        System.out.println("Giá trị trung bình của các sản phẩm = " + (double) sum / list.size());
    }

    public void Menu() {
        int choice = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("----------------------------------------");
                System.out.println("1. Nhập danh sách");
                System.out.println("2. Xuất danh sách");
                System.out.println("3. Sắp xếp giá theo giá trị giảm dần");
                System.out.println("4. Tìm và xóa theo tên");
                System.out.println("5. Giá trị trung bình tất cả sản phẩm");
                System.out.println("6. Thoát chương trình");
                System.out.println("----------------------------------------");

                System.out.print("Nhập lựa chọn của bạn : ");
                choice = Integer.parseInt(sc.nextLine());

                if (choice < 1 || choice > 6) {
                    System.out.println("Không hợp lệ!!!");
                    choice = 6;
                } else {
                    switch (choice) {
                        case 1 -> Input();
                        case 2 -> Output();
                        case 3 -> Sort();
                        case 4 -> FindandRemove();
                        case 5 -> GiaTriTRB();
                        case 6 -> System.exit(0);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Lua chon khong hop le : " + e.getMessage());
            }
        } while (choice != 6);
    }
}
