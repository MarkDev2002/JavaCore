package SimpleCode;

import java.util.Scanner;

public class MultiplicationTableOutput {
    public static void main(String[] args) {
        int a, b = 1, c;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập bảng cửu chương cần in : ");
            a = sc.nextInt();
            if (a >= 10) {
                System.out.println("Nhập lại!!\n");
            } else {
                while (b <= 10) {
                    c = a * b;
                    System.out.printf("%d x %d = %d\n", a, b, c);
                    b++;
                }
            }
        } while (a >= 10);
    }
}
