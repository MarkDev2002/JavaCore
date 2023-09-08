package Chuong3;

public class Line {
    private Point A;
    private Point B;

    public Line() {
        A = new Point();
        B = new Point();
    }

    public Line(Point p, Point p2) {
        this.A = p;
        this.B = p2;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public void hienThi() {
        System.out.printf("(%.1f,%.1f) , (%.1f,%.1f)\n",
                this.A.getX(), this.A.getY(), this.B.getX(), this.B.getY());
    }

    public double DoDai() {
        return this.A.Distance(this.B);
    }
}
