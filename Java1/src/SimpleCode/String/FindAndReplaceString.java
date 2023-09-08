package SimpleCode.String;

import java.util.Scanner;

public class FindAndReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi : ");
        String content = String.valueOf(sc.nextLine());

        System.out.print("Nhập nội dung cần tìm : ");
        String find = String.valueOf(sc.nextLine());

        System.out.print("Nhập nội dung thay thế : ");
        String replace = String.valueOf(sc.nextLine());

        String result = content.replaceAll(find,replace);

        System.out.println("Nội dung sau khi thay thế : " + result);
    }
}
