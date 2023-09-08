package SimpleCode;

import java.util.Scanner;

public class GiaiThua {

    public static long giaiThua(int n)
    {
        if(n > 0)
        {
            return n * giaiThua(n - 1);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Giai thừa của " + a + " là :  " + giaiThua(a));
        sc.close();
    }
}
