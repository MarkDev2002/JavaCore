package SimpleCode.String;

import java.util.Scanner;

public class NameString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên của bạn : ");
        String hoten = String.valueOf(sc.nextLine());
        hoten = hoten.trim();
        String[] ars = hoten.split("\\s+");
        if(ars.length < 3)
        {
            System.out.println("Họ và tên phải có đầy đủ họ , tên đệm và tên!!");
            return;
        }

        System.out.println("\nHọ viết hoa : " + ars[0].toUpperCase());
        System.out.println("Tên đệm viết thường : " + ars[1]);
        System.out.println("Tên viết hoa : " + ars[2].toUpperCase());


    }
}
