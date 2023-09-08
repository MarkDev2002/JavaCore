package ManageCompany;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class DanhSachNhanVien {

    ArrayList<NhanVien> list = new ArrayList<>();


    public void inputData() {
        list.clear();
        System.out.println("\nNhập danh sách nhân viên (To stop please press 0!!!) \n");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập mã nhân viên : ");
            String ID = String.valueOf(sc.nextLine());

            if (ID.equalsIgnoreCase("0")) {
                break;
            }

            System.out.print("Nhập họ tên nhân viên : ");
            String name = String.valueOf(sc.nextLine());

            System.out.print("Nhập lương cơ bản (VNĐ) : ");
            double luongCoBan = Double.parseDouble(sc.nextLine());

            System.out.print("Bạn thuộc phòng ban nào ? (Hành chính / Kinh doanh) : ");
            String phongBan = String.valueOf(sc.nextLine());

            if (phongBan.equalsIgnoreCase("Hành chính")) {
                System.out.print("Nhập ngày công : ");
                double ngayCong = sc.nextDouble();
                NhanVien nvhanhchinh = new NhanVienHanhChinh(ID, name, luongCoBan, phongBan, ngayCong);
                list.add(nvhanhchinh);

            } else if (phongBan.equalsIgnoreCase("Kinh doanh")) {
                System.out.print("Nhập lương kinh doanh : ");
                double luongKinhDoanh = sc.nextDouble();
                NhanVien nvkinhdoanh = new NhanVienKinhDoanh(ID, name, luongCoBan, phongBan, luongKinhDoanh);
                list.add(nvkinhdoanh);
            } else {
                System.out.println("Sai!!! Vui lòng nhập lại!!!");
            }

        } while (true);
    }

    public void outputData() {
        System.out.println("------------------");
        for (NhanVien nv : list) {
            System.out.printf("Mã nhân viên : %s | Họ tên : %s | Phòng ban : %s | Lương : %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());
        }
    }

    public void delEmployeeByID() {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID nhân viên cần xóa : ");
        String ID = sc.nextLine();
        for (NhanVien nv : list) {
            if (ID.equalsIgnoreCase(nv.getID())) {
                found = true;
                list.remove(nv);
                break;
            }
        }

        if (!found) {
            System.out.println("nhân viên không tồn tại");
        }
    }

    public void updateInformationEmplyeeByID() {
        NhanVien found = null; //nhân viên lúc này rỗng
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên cần cập nhật : ");
        String IDfind = String.valueOf(sc.nextLine());
        for (NhanVien nv : list) {
            if (IDfind.equalsIgnoreCase(nv.getID())) {
                list.remove(nv);
                found = nv;
                index = list.indexOf(nv); //ghi đè vào đúng vị trí nhân viên đó
                break;
            }
        }
        if (found != null) {
            System.out.print("Nhập mã nhân viên : ");
            String ID = String.valueOf(sc.nextLine());
            if (ID.equals("") || ID == null) {
                ID = found.getID();
            }
            System.out.print("Nhập họ tên nhân viên : ");
            String name = String.valueOf(sc.nextLine());
            if (name.equals("") || name == null) {
                name = found.getHoTen();
            }
            System.out.print("Nhập lương cơ bản : ");
            String luongCoBan = sc.nextLine();
            if (luongCoBan.equals("") || luongCoBan == null) {
                luongCoBan = String.valueOf(found.getLuongCoBan());
            }

            if (found instanceof NhanVienHanhChinh) {
                System.out.print("Nhập ngày công : ");
                String ngayCong = sc.nextLine();
                if (ngayCong.equals("") || ngayCong == null) {
                    ngayCong = String.valueOf(((NhanVienHanhChinh) found).getNgayCong());
                }
                NhanVien nv = new NhanVienHanhChinh(ID, name, Double.parseDouble(luongCoBan), "Hành chính", Double.parseDouble(ngayCong));
                list.set(index, nv);
            }

            if (found instanceof NhanVienKinhDoanh) {
                System.out.print("Nhập lương kinh doanh : ");
                String luongKinhDoanh = sc.nextLine();
                if (luongKinhDoanh.equals("") || luongKinhDoanh == null) {
                    luongKinhDoanh = String.valueOf(((NhanVienKinhDoanh) found).getLuongKinhDoanh());
                }
                NhanVien nv = new NhanVienKinhDoanh(ID, name, Double.parseDouble(luongCoBan), "Kinh doanh", Double.parseDouble(luongKinhDoanh));
                list.set(index, nv);
            }
        } else {
            System.out.println("nhân viên không tồn tại!!!");
        }
    }

    public void findEmployeeBySalary() {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm nhân viên theo khoảng lương");

        System.out.print("Nhập khoảng thấp nhất : ");
        double min = sc.nextDouble();

        System.out.print("Nhập khoảng lớn nhất : ");
        double max = sc.nextDouble();

        for (NhanVien nv : list) {
            if (min <= nv.getLuong() && nv.getLuong() <= max) {
                found = true;
                System.out.printf("Mã nhân viên : %s | Họ tên : %s | Phòng ban : %s | Lương : %.2f\n", nv.getID(), nv.getHoTen(), nv.getPhongBan(), nv.getLuong());

            }
        }

        if (!found) {
            System.out.println("Không có nhân viên nào trong khoảng lương cần tìm!!!");
        }
    }

    public void sortName() {
        Comparator<NhanVien> comp = Comparator.comparing(NhanVien::getHoTen);
        list.sort(comp);
        outputData();
    }

    public void sortSalary() {
        Comparator<NhanVien> comp = Comparator.comparing(NhanVien::getLuong);
        list.sort(comp);
        outputData();
    }

    public void top5() {
        list.sort((a, b) -> (int) (b.getLuong() - a.getLuong()));
        for (int i = 0; i < 5; i++) {
            System.out.printf("Mã nhân viên : %s | Họ tên : %s | Phòng ban : %s | Lương : %.2f\n", list.get(i).getID(), list.get(i).getHoTen(), list.get(i).getPhongBan(), list.get(i).getLuong());
        }
    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu chương trình");
            System.out.println("1.Nhập danh sách nhân viên");
            System.out.println("2.Xuất danh sách nhân viên");
            System.out.println("3.Xóa nhân viên theo mã");
            System.out.println("4.Cập nhật nhân viên theo mã");
            System.out.println("5.Tìm kiếm nhân viên theo lương");
            System.out.println("6.Sắp xếp tên nhân viên tăng dần ");
            System.out.println("7.Sắp xếp lương nhân viên tăng dần");
            System.out.println("8.Xuất 5 nhân viên có thu nhập cao nhất công ty");

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
                    delEmployeeByID();
                case 4:
                    updateInformationEmplyeeByID();
                    break;
                case 5:
                    findEmployeeBySalary();
                    break;
                case 6:
                    sortName();
                    break;
                case 7:
                    sortSalary();
                    break;
                case 8:
                    top5();
                    break;
                default:
                    System.out.println("Error!!");
            }
        } while (choice != 0);
    }
}
