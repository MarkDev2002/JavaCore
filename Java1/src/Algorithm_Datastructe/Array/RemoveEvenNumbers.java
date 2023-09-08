package Algorithm_Datastructe.Array;

public class RemoveEvenNumbers {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddcount = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                oddcount++; //kiếm ra được 3 phần tử khác 0 ( 3,7,5 )
            }
        }
        int[] result = new int[oddcount]; //tạo 1 mảng mới có độ dài bằng 3
        int index = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                result[index] = i; //ghép lần lượt các phần tử đã tìm được khác 0 vào lần lượt vị trí của index
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        printArray(arr);
        int[] result = removeEven(arr);
        printArray(result);
    }
}
