package Algorithm_Datastructe.Array;

public class Resize { //thay đổi kích thước của 1 mảng bằng cách copy toàn bộ mảng ban đầu sang mảng khác

    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        Resize arrUtil = new Resize();
        int[] original = new int[]{
                3, 2, 4, 7, 10, 6, 5
        };
        System.out.println("The size of original array : " + original.length);
        original = arrUtil.resize(original, 10);
        System.out.println("The size of original array after resize : " + original.length);


    }
}
