package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");

        list.forEach(item -> System.out.println(item)); //in ra các phần tử có trong danh sách
    }
}
