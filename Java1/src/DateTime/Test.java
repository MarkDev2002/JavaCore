package DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //lấy thời gian theo ms
        long start = System.currentTimeMillis(); //thời gian bắt đầu

        try {
            for (int i = 0; i < 1000; i++) {
                Thread.sleep(2);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis(); //thời gian kết thúc
        System.out.println(end - start + " ms"); //tính ra được tổng thời gian chạy chương trình

        //lấy thời gian theo ns

        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println(end - start + " ns");

        //Display the time of system

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //quy định xâu chuỗi hiển thị
        Date date = new Date(); //lấy thời gian thực của hệ thống
        String day = dateFormat.format(date);
        System.out.println(day);

    }
}
