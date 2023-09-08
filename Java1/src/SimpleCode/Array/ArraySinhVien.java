package SimpleCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập sinh viên thứ " + i + 1 + "  : ");
            a[i] = String.valueOf(sc.nextLine());
        }
        System.out.println("Mảng sinh viên : " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mảng sinh viên sau khi sắp xếp tăng dần theo chữ cái : " + Arrays.toString(a));
    }
}
