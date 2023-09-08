package SimpleCode.String;

import java.util.Scanner;

public class LogInSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tài khoản : ");
        String tk = String.valueOf(sc.nextLine());
        System.out.print("Nhập mật khẩu : ");
        String mk = String.valueOf(sc.nextLine());
        if (tk.equalsIgnoreCase("admin") && (mk.equalsIgnoreCase("Kiet1234567"))) {
            System.out.println("Welcome back " + tk);
        } else {
            System.out.println("Sai tài khoản hoặc mật khẩu vui lòng nhập lại!!!!");
        }
    }
}
