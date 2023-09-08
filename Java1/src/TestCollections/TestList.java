package TestCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList {

    //List sử dụng collections
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(4);

        System.out.println("List : " + list);

        Collections.sort(list); //sắp xếp tăng dần
        System.out.println("List : " + list);

        Collections.shuffle(list);//sắp xếp ngẫu nhiên
        System.out.println("List : " + list);

        list.sort((a, b) -> b - a); //sắp xếp giảm dần
        System.out.println("List : " + list);

        Collections.sort(list);
        int index = Collections.binarySearch(list, 1);

        System.out.println("Found at index " + index);
        //Trước khi sử dụng binarsearch thì dãy phải được sắp xếp ms sử dụng được

        List<String> names = new ArrayList<>();

        names.add("Tuấn");
        names.add("Bảo");
        names.add("Kiệt");
        names.add("Tín");

        names.set(0, "Châu"); //thay đổi giá trị tại vị trí nào đó

        System.out.print(names + " ");

        names.remove("Tín"); //xóa giá trị được chỉ định

        System.out.print(names + " ");

    }
}