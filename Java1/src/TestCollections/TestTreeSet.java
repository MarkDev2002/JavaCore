package TestCollections;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");

        System.out.println(treeSet);

        //TreeSet dùng để sắp xếp

    }
}
