package SimpleCode.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử có trong mảng động : ");
        int n = sc.nextInt();
        ArrayList<Double> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ a[" + i + "] : ");
            double d = sc.nextDouble();
            ds.add(d);
        }

        int sum = 0;
        System.out.print("Các phần tử trong mảng động : ");
        for (Double item : ds) {
            System.out.print(item + " \t");
            sum += item;
        }
        System.out.println("\nTổng các phần tử trong mảng động : " + sum);
    }
}
