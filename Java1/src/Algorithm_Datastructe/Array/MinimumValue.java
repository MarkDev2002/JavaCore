package Algorithm_Datastructe.Array;

public class MinimumValue {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int findMinimumValue(int[] arr) {
        int min_value = arr[0];
        for (int i : arr) {
            if (i < min_value) {
                min_value = i;
            }
        }
        return min_value;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        printArray(arr);
        int result = findMinimumValue(arr);
        System.out.println(result);
    }
}
