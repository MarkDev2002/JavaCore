package SimpleCode.String;

import java.util.Scanner;

public class ReplaceAndCheckOvenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi phân cách bằng dấu , : ");
        String str = String.valueOf(sc.nextLine());
        String[] st = str.split(","); //chuỗi được tách theo dấu phẩy
        System.out.print("Các số chẵn có trong mảng : ");
        for (String item : st) {
            int n = Integer.parseInt(item);

            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
