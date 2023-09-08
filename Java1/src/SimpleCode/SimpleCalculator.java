package SimpleCode;

import java.util.Scanner;

public class SimpleCalculator {
    public static float plus(float a, float b) {
        return a + b;
    }

    public static float minus(float a, float b) {
        return a - b;
    }

    public static float times(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a : ");
        float a = sc.nextFloat();
        System.out.print("Nhập b : ");
        float b = sc.nextFloat();
        System.out.println("----------------------");
        System.out.println(" - 1. Cong           -");
        System.out.println(" - 2. Tru            -");
        System.out.println(" - 3. Nhan           -");
        System.out.println(" - 4. Chia           -");
        System.out.println("----------------------");
        System.out.print("Mời bạn nhập lựa chọn : ");
        int chon = sc.nextInt();
        switch (chon) {
            case 1 -> System.out.println(plus(a, b));
            case 2 -> System.out.println(minus(a, b));
            case 3 -> System.out.println(times(a, b));
            case 4 -> System.out.println(divide(a, b));
            default -> System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
