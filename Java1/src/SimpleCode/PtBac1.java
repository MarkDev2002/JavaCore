package SimpleCode;

import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
        float a, b, No;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        a = sc.nextFloat();
        System.out.print("Nhập b : ");
        b = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            No = -b / a;
            System.out.println("Phương trình có nghiệm duy nhất là : " + No);
        }
    }
}
