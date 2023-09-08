package SimpleCode.CheckValidation;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDataCheckValidation {
    private final ArrayList<InputData> list = new ArrayList<>();

    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++)
        {
            InputData ds = new InputData();
            ds.Input();
            list.add(ds);
        }
    }

    public void Output()
    {
        System.out.println("--------------------------------");
        System.out.println("Danh sách");
        for (InputData item : list)
        {
            item.Output();
        }
    }
}
