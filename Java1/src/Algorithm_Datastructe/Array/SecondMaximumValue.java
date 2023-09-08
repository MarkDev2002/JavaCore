package Algorithm_Datastructe.Array;

public class SecondMaximumValue {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int findSecondMaximumValue(int[] arr) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i]; //gán giá trị lớn nhất vào biến max

            }
        }
        int secondMaximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > secondMaximum && arr[i] < maximum) {
                secondMaximum = arr[i];
            }
        }
        return secondMaximum;
    }

    public static void main(String[] args) {
        SecondMaximumValue find = new SecondMaximumValue();
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        printArray(arr);
        System.out.println(find.findSecondMaximumValue(arr));
    }
}
