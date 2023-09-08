package SortAlgorithm;

public class InsertionSort {

    public static void printArray(int n, int[] a) {
        System.out.printf("%d : ", n);
        for (int j : a) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // Chèn a[i] vào dãy 0 -> i - 1

            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > a[i]) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = ai;
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        insertionSort(a);
    }

    //Chạy từ đầu đến cuối mảng
    //Làm lần lượt từ trái qua phải
    //Tại vòng lặp thứ i, coi như dãy từ [0,i-1] đã được sắp xếp (bên trái dãy), chèn phần tử a[i] vào vị trí thích hợp
    //Sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp
}
