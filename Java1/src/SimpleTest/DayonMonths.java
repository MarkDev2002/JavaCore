package SimpleTest;

import java.util.Scanner;

public class DayonMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month, year;
        do {
            System.out.print("Nhap vao 1 thang : ");
            month = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap vao 1 nam : ");
            year = Integer.parseInt(sc.nextLine());


            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Co 31 ngay\n\n");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.print("Co 30 ngay\n\n");
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
                        System.out.println("Co 29 ngay\n\n");
                    } else {
                        System.out.println("Co 28 ngay\n\n");
                    }
                case 0:
                    return;
                default:
                    System.out.println("Nhap du lieu sai!!!\n\n");
            }
        } while (month != 0);
    }
}
