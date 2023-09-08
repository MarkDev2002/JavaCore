package SimpleCode.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestArrayListString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử có trong mảng động : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ a[" + i + "] : ");
            String st = String.valueOf(sc.nextLine());
            ds.add(st);
        }

        Collections.shuffle(ds);//shuffle : hoán vị ngẫu nhiên

        System.out.print("Giá trị các phần tử : ");
        for (String item : ds) {
            System.out.print(item + " ");
        }
    }
}
