package Chuong3;

public class TestPointLine {
    public static void main(String[] args) {
        Point p = new Point(10, 25);
        p.Output();
        System.out.println("");
        Point p2 = new Point(5, 9);
        p2.Output();
        System.out.println("");
        System.out.printf("Khoang cach = %.2f\n", p.Distance(p2));
        System.out.println("");
        Line dt = new Line(p, p2);
        dt.hienThi();
        System.out.printf("Do dai = %.2f\n", dt.DoDai());
    }
}
