package SortAlgorithm;

public class SelectionSort {

    public static void printArray(int n, int[] a) {
        System.out.printf("%d: ", n);
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;

                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        selectionSort(a);
    }
}
