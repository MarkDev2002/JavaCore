package Algorithm_Datastructe.Array;

public class MoveAllZeroToEnd {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) { //nếu có phần tử bằng không đổi chỗ
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) { //tăng vị trí lên
                j++;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 0, 10, 6, 5};
        printArray(arr);
        moveZeros(arr);
    }
}
