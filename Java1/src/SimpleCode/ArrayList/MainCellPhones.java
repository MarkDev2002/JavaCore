package SimpleCode.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCellPhones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cellphones> list = new ArrayList<>();
        System.out.print("Số lượng sản phẩm : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Cellphones sp = new Cellphones();
            sp.Input();
            list.add(sp);
        }

        for(Cellphones ds : list)
        {
            if(ds.getCompany().equalsIgnoreCase("Nokia"))
            {
                ds.Output();
                System.out.println();
            }
        }
    }
}
