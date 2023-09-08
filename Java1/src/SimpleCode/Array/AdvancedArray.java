package SimpleCode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("Mảng sau khi nhập : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println("\nMảng sau khi sắp xếp tăng dần : " + Arrays.toString(a));

        System.out.print("\nNhập phần tử cần tìm : ");
        int index = sc.nextInt();
        int find = Arrays.binarySearch(a, index);
        System.out.println("Vị trí của " + index + " = " + find);

        Arrays.fill(a, 1);
        System.out.println("\nMảng sau khi làm đầy : " + Arrays.toString(a));
    }
}
