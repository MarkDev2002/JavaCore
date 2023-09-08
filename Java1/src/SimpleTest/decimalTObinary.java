package SimpleTest;

import java.util.Scanner;

public class decimalTObinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so nguyen : ");
        n = sc.nextInt();
        String binary = "";
        while(n > 0)
        {
            binary = (n % 2) + binary ;
            n = n / 2;
        }
        System.out.print("Binary : " + binary);
    }
}
