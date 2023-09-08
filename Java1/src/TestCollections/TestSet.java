package TestCollections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        //Set sử dụng collections
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(3);

        System.out.println("Set : " + set);

        //HashSet dùng để tìm kiếm cho nhanh
    }
}
