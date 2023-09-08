package SimpleCode;

import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật : ");
        float cd = sc.nextFloat();
        System.out.print("Nhập chiều rộng hình chữ nhật : ");
        float cr = sc.nextFloat();
        System.out.println("Chu vi hình chữ nhật = " + (cd + cr) * 2);
        System.out.println("Diện tích hình chữ nhật = " + cd * cr);
        System.out.println("Cạnh nhỏ nhất của hình chữ nhật là : " + Math.min(cd, cr));
    }
}
