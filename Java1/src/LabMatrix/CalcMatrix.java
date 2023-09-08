package LabMatrix;

public class CalcMatrix {
    public void addMatrix() {
        Validation vla = new Validation();

        int row1 = vla.getSize("Enter row matrix 1 : ");
        int col1 = vla.getSize("Enter column matrix 1 : ");
        int[][] matrix1 = vla.getMatrix(row1, col1);

        int row2;
        int col2;

        while (true) {
            row2 = vla.getSize("Enter row matrix 2 : ");
            if (row2 == row1) {
                break;
            } else {
                System.out.println("Row 2 and Row 1 must equal!!");
            }
        }

        while (true) {
            col2 = vla.getSize("Enter column matrix 2 : ");
            if (col2 == col1) {
                break;
            } else {
                System.out.println("Col 2 and Col 1 must equal!!");
            }
        }

        int[][] matrix2 = vla.getMatrix(row2, col2);

        int[][] result = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        vla.printMatrix(matrix1, row1, col1);
        System.out.println("+++++++++++");
        vla.printMatrix(matrix2, row2, col2);
        System.out.println("===========");
        vla.printMatrix(result, row2, col2);
    }

    public void subMatrix() {
        Validation vla = new Validation();

        int row1 = vla.getSize("Enter row matrix 1 : ");
        int col1 = vla.getSize("Enter column matrix 1 : ");
        int[][] matrix1 = vla.getMatrix(row1, col1);

        int row2;
        int col2;

        while (true) {
            row2 = vla.getSize("Enter row matrix 2 : ");
            if (row2 == row1) {
                break;
            } else {
                System.out.println("Row 2 and Row 1 must equal!!");
            }
        }

        while (true) {
            col2 = vla.getSize("Enter column matrix 2 : ");
            if (col2 == col1) {
                break;
            } else {
                System.out.println("Col 2 and Col 1 must equal!!");
            }
        }

        int[][] matrix2 = vla.getMatrix(row2, col2);

        int[][] result = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        vla.printMatrix(matrix1, row1, col1);
        System.out.println("-----------");
        vla.printMatrix(matrix2, row2, col2);
        System.out.println("===========");
        vla.printMatrix(result, row2, col2);
    }

    public void multiMatrix() {
        Validation vla = new Validation();

        int row1 = vla.getSize("Enter row matrix 1 : ");
        int col1 = vla.getSize("Enter column matrix 1 : ");
        int[][] matrix1 = vla.getMatrix(row1, col1);

        int row2;
        while (true) {
            row2 = vla.getSize("Enter row matrix 2 : ");
            if (row2 == col1) {
                break;
            } else {
                System.out.println("Col 1 and Row 2 must equal!!");
            }
        }
        int col2 = vla.getSize("Enter row matrix 2 : ");
        ;

        int[][] matrix2 = vla.getMatrix(row2, col2);

        int[][] result = new int[row2][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }

        vla.printMatrix(matrix1, row1, col1);
        System.out.println("***********");
        vla.printMatrix(matrix2, row2, col2);
        System.out.println("===========");
        vla.printMatrix(result, row2, col2);
    }
}
