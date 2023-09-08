package SimpleCode.Array;

import java.util.Scanner;

public class TBCongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập a[" + i + "] :  ");
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int item : a) {
            sum += item;
        }
        System.out.println("Tổng các phần tử của mảng : " + sum);
        System.out.println("Giá trị trung bình các phần tử trong mảng = " + (float) sum / a.length);
    }
}
