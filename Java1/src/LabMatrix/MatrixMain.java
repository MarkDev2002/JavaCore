package LabMatrix;

import java.util.Scanner;

public class MatrixMain {

    public static void main(String[] args) {
        Validation vla = new Validation();
        CalcMatrix c = new CalcMatrix();
        while (true) {
            vla.Menu();
            int choice = vla.getChoice();
            switch (choice) {
                case 1:
                    c.addMatrix();
                    break;
                case 2:
                    c.subMatrix();
                    break;
                case 3:
                    c.multiMatrix();
                    break;
                case 0:
                    System.out.println("Thoát thành công");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!!");
            }
        }
    }
}
