package Algorithm_Datastructe.Array;

public class Reverse {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        printArray(arr);
        reverseArray(arr, 0, arr.length - 1);
    }
}
