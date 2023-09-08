package TestCollections;

import java.util.*;

public class DelContainList {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            firstList.add(sc.nextInt());
        }

        //cách 1
        List<Integer> secondList = new ArrayList<>();

        for (Integer integer : firstList) {
            if (!secondList.contains(integer)) {
                secondList.add(integer);
            }
        }

        for (int element : secondList) {
            System.out.print(element + " ");
        }

        //cách 2

        Set<Integer> set = new HashSet<>(firstList);
        System.out.print("\n" + set + " ");

    }
}
