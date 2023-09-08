package SimpleCode;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        float number, tien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện đã sử dụng : ");
        number = sc.nextFloat();
        if (number <= 50) {
            tien = number * 1000;
        } else {
            tien = 50 * 1000 + (number - 50) * 1200;
        }
        System.out.printf("Tiền điện bạn phải trả trong tháng này là : %.2f", tien);
    }
}
