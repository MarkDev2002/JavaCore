package SortAlgorithm;

public class BubbleSort {

    public static void printArray(int n0, int[] a) {
        System.out.printf("%d: ", n0);
        for (int j : a) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                // Xét 2 ptử j và j + 1 phải thỏa mãn j + 1 < n - i -> j < n - i -1
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(i, a);
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7, 6};
        bubbleSort(a);
    }

    //Nhược điểm : đi từ đầu đến cuối và so sánh 2 ptử gần nhau mặc dù đã đúng thứ tự
}
