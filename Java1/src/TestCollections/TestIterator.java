package TestCollections;

import java.util.ArrayList;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Tín");
        names.add("Kiệt");
        names.add("Bảo");
        names.add("Châu");
        names.add("Huy");

        //duyệt in ra các phần tử

        //c1

        for(String element : names)
        {
            System.out.print(element + " ");
        }

        //c2

        for (String ten : names) {
            System.out.print("\n >> Tên : " + ten);
        }
    }
}
