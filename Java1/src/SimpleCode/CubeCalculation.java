package SimpleCode;

import java.util.Scanner;

public class CubeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh của hình lập phương : ");
        float edge = sc.nextFloat();
        System.out.println("Thể tích của hình lập phương = " + (float) Math.pow(edge, 3));
    }
}
