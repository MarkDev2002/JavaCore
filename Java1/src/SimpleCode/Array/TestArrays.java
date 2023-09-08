package SimpleCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrays {

    static Scanner sc = new Scanner(System.in);

    public static void Input(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ a[" + i + "] : ");
            a[i] = sc.nextInt();
        }
    }

    public static void Output(int[] a) {
        System.out.println("Phần tử mảng : " + Arrays.toString(a));
    }

    public static void minValue(int[] a, int n) {
        Arrays.sort(a);
        System.out.println("Mảng sau khi đã sắp xếp tăng dần : " + Arrays.toString(a));
        int min = a[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
        }
        System.out.println("Giá trị nhỏ nhất của phần tử trong mảng : " + min);
    }


    public static void TBC(int[] a, int n) {
        int tong = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                tong += a[i];
                count++;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3 trong mảng : " + (float) tong / count);
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử trong mảng : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Input(a, n);
        Output(a);
        minValue(a, n);
        TBC(a, n);
    }
}
