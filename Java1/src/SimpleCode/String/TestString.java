package SimpleCode.String;

import java.util.ArrayList;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Nhập số lượng phần tử của mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập tên sinh viên thứ %d : ", i + 1);
            String str = String.valueOf(sc.nextLine());
            if (str.isEmpty()) {
                break;
            }
            list.add(str);
        }

        for (String item : list) {
            item = item.trim(); // xóa khoảng trắng thừa ở đầu và cuối dòng
            if (item.startsWith("Nguyễn ") || item.endsWith(" Tuấn")) {
                String ho = item.substring(0, item.indexOf(" ")); // chạy từ đầu đến khoảng trắng đầu tiên
                String ten = item.substring(item.lastIndexOf(" ")); // chạy từ khoảng trắng cuối cùng đến hết
                String tenDem = item.substring(item.indexOf(" "), item.lastIndexOf(" ")); // lấy vị trí xuất hiện khoảng trắng đầu tiên đến khoảng trắng cuối cùng
                System.out.printf("Họ tên : %s %s %s \n", ho.toUpperCase(), tenDem, ten.toUpperCase());
            }
        }

        System.out.print("Họ tên có chứa lót là Mỹ : ");
        for (String item : list) {

            if (item.indexOf(" Mỹ ") > 0) { // Nếu như chữ Mỹ đầu tiên xuất hiện lớn hơn vị trí 0
                System.out.print(item + " ----");
            }
        }
    }
}