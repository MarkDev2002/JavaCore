package SimpleCode.OOPBasic.Inheritance;

public class Square extends Reactangle {
    public Square(double canh) {
        super(canh, canh);
        double rong = canh;
    }

    public void Output() {
        System.out.printf("Chu vi hình vuông : %.2f | Diện tích hình vuông : %.2f", getChuVi(), getDienTich());
    }
}
