package SimpleCode;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double luong, thuong, thunhap, thue;
        System.out.print("Nhập lương : ");
        luong = sc.nextDouble();
        System.out.print("Nhập thưởng : ");
        thuong = sc.nextDouble();
        thunhap = luong + thuong;
        if (thunhap >= 30000000) {
            thue = thunhap * 0.3;
        } else if (thunhap >= 15000000) {
            thue = thunhap * 0.15;
        } else if (thunhap >= 9000000) {
            thue = thunhap * 0.1;
        } else {
            thue = 0;
        }
        System.out.printf("Tổng thu nhập chưa thế của bạn là : %.2f", thunhap);
        System.out.printf("\nThuế của bạn là : %.2f" , thue);

    }
}
