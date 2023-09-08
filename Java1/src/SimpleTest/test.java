package SimpleTest;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số phần tử của mảng : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int tong = 0;
        for (int j : arr) {
            tong += j;
        }
        System.out.print("Tổng = " + tong);
    }
}
