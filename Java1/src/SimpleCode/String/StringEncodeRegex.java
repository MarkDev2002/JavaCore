package SimpleCode.String;

import java.util.Scanner;

public class StringEncodeRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập email : ");
        String email = String.valueOf(sc.nextLine());

        System.out.print("Nhập số điện thoại : ");
        String phone = String.valueOf(sc.nextLine());

        String reMail = "\\w+@\\w+\\.\\w+";
        if (email.matches(reMail)) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Bạn đã nhập sai định dạng email");
        }

        String rePhone = "0543\\d{6}";
        if (phone.matches(rePhone)) {
            System.out.println("Số điện thoại hợp lệ mã vùng huế");
        } else {
            System.out.println("Số điện thoại sai mã vùng huế");
        }

    }
}
