package SimpleCode;

import java.util.Scanner;

public class PtBac2 {
    public static void main(String[] args) {
        float a, b, c, delta, x1, x2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextFloat();
        System.out.print("Nhập b : ");
        b = sc.nextFloat();
        System.out.print("Nhập c : ");
        c = sc.nextFloat();

        if (a == 0) {
            System.out.println("Nhap du lieu sai!!!!");
        } else {
            delta = (float) Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT vo nghiem!!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("PT co nghiem kep x1 = x2 = " + x1);
            } else {
                x1 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                x2 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                System.out.println("PT co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
