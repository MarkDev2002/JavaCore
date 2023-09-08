package Algorithm_Datastructe.Array;

public class FindMissingNumber { //tìm số còn thiếu trong 1 mảng từ 1 -> n-1

    public int findMissingNumber(int[] arr) {
        int n = arr.length;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum; //tìm được sum dương out vòng
    }

    public static void main(String[] args) {
        FindMissingNumber find = new FindMissingNumber();
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("The missing number is : " + find.findMissingNumber(arr));

    }
}
