package SimpleCode.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Double> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            double d = sc.nextDouble();
            number.add(d);
        }
        double sum = 0;
        System.out.print("Các phần tử trong mảng động : ");
        for (Double item : number) {
            System.out.print(item + " \t");
            sum += item;
        }
        System.out.println("\nTổng các phần tử trong mảng động : " + sum);
    }
}
