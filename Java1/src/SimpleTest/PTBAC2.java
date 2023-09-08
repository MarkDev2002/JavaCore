package SimpleTest;

import java.util.Scanner;

public class PTBAC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, delta;
        System.out.print("Nhap vao a : ");
        a = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap vao b : ");
        b = Float.parseFloat(sc.nextLine());
        System.out.print("Nhap vao c : ");
        c = Float.parseFloat(sc.nextLine());

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Nhap du lieu sai!!!!");
        } else {
            if (delta < 0) {
                System.out.println("PT vo nghiem!!");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("PT co nghiem kep x1 = x2 = " + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("PT co 2 nghiem phan biet");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }
}
