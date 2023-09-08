package Puzzle_AKT;

import java.util.ArrayList;

public class IndexMatrix implements Comparable<IndexMatrix> {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private final int[][] arr;
    private int g, f, h;
    private IndexMatrix parent;
    private final ArrayList<IndexMatrix> adjacency;

    public IndexMatrix(int[][] arr, int g, int f, int h) {
        this.arr = arr;
        this.g = g;
        this.f = f;
        this.h = h;
        this.adjacency = new ArrayList<>();
    }

    public int[][] getArr() {
        return arr;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public IndexMatrix getParent() {
        return parent;
    }

    public void setParent(IndexMatrix parent) {
        this.parent = parent;
    }

    public ArrayList<IndexMatrix> getAdjacency() {
        return adjacency;
    }

    // Tính toán các giá trị của g,h,f cho đối tượng v
    public void adjacency(IndexMatrix v, IndexMatrix endIndexMatrix) {
        v.setG(this.getG() + 1);
        v.setH(calHeuristic(v.getArr(), endIndexMatrix.getArr()));
        v.setF(v.getG() + v.getH());
        v.setParent(this); // theo dõi đường dẫn đã thực hiện để đạt được v.

        // theo dõi những nút nào đã truy cập và các nút nào vẫn chưa được truy cập
        this.adjacency.add(v);
    }

    private int calHeuristic(int[][] currentArr, int[][] endArr) {
        int heuristic = 0;
        for (int i = 0; i < currentArr[0].length; ++i) {
            for (int j = 0; j < currentArr[0].length; ++j) {
                if (currentArr[i][j] != 0 && currentArr[i][j] != endArr[i][j]) {
                    ++heuristic;
                }
            }
        }
        return heuristic;
    }

    public static boolean compareArr(int[][] arrA, int[][] arrB) {
        for (int i = 0; i < arrA[0].length; ++i) {
            for (int j = 0; j < arrA[0].length; ++j) {
                if (arrA[i][j] != arrB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public IndexMatrix goTop() {
        int[][] copyArr = copyArr();
        boolean blankFound = false;
        for (int i = 0; i < copyArr.length; ++i) {
            for (int j = 0; j < copyArr.length; ++j) {
                // ptu có chứa khoảng trống hay không và ktra xem ptu đó nằm ở hàng trên cùng chưa
                if (copyArr[i][j] == 0 && i != 0) {

                    // Đặt giá trị của phần tử hiện tại thành giá trị của phần tử ngay phía trên nó.
                    copyArr[i][j] = copyArr[i - 1][j];

                    // Đặt giá trị của phần tử ngay phía trên phần tử hiện tại thành 0
                    copyArr[i - 1][j] = 0;
                    blankFound = true;
                    break;
                }
            }
            if (blankFound) {
                break;
            }
        }
        return new IndexMatrix(copyArr, 0, 0, 0);
    }

    public IndexMatrix goBottom() {
        int[][] copyArr = copyArr();
        boolean blankFound = false;
        for (int i = 0; i < copyArr.length; ++i) {
            for (int j = 0; j < copyArr.length; ++j) {
                // ptu có khoảng trống hay không và ktra xem ptu đó nằm ở hàng dưới cùng chưa
                if (copyArr[i][j] == 0 && i != copyArr.length - 1) {

                    // Đặt giá trị của phần tử hiện tại thành giá trị của phần tử ngay phía dưới nó.
                    copyArr[i][j] = copyArr[i + 1][j];

                    // Đặt giá trị của phần tử ngay phía dưới phần tử hiện tại thành 0
                    copyArr[i + 1][j] = 0;
                    blankFound = true;
                    break;
                }
            }
            if (blankFound) {
                break;
            }
        }
        return new IndexMatrix(copyArr, 0, 0, 0);
    }

    public IndexMatrix goLeft() {
        int[][] copyArr = copyArr();
        boolean blankFound = false;
        for (int i = 0; i < copyArr.length; ++i) {
            for (int j = 0; j < copyArr.length; ++j) {
                // ptu có khoảng trống hay không và ktra xem ptu đó nằm ở hàng bên trái ngoài cùng chưa
                if (copyArr[i][j] == 0 && j != 0) {

                    // Đặt giá trị của phần tử hiện tại thành giá trị của phần tử ngay bên trái nó.
                    copyArr[i][j] = copyArr[i][j - 1];

                    // Đặt giá trị của phần tử ngay phía trái phần tử hiện tại thành 0
                    copyArr[i][j - 1] = 0;
                    blankFound = true;
                    break;
                }
            }
            if (blankFound) {
                break;
            }
        }
        return new IndexMatrix(copyArr, 0, 0, 0);
    }

    public IndexMatrix goRight() {
        int[][] copyArr = copyArr();
        boolean blankFound = false;
        for (int i = 0; i < copyArr.length; ++i) {
            for (int j = 0; j < copyArr.length; ++j) {
                if (copyArr[i][j] == 0 && j != copyArr.length - 1) {
                    copyArr[i][j] = copyArr[i][j + 1];
                    copyArr[i][j + 1] = 0;
                    blankFound = true;
                    break;
                }
            }
            if (blankFound) {
                break;
            }
        }
        return new IndexMatrix(copyArr, 0, 0, 0);
    }

    private int[][] copyArr() {
        int[][] newArr = new int[arr[0].length][arr[0].length];
        for (int i = 0; i < arr[0].length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                newArr[i][j] = arr[i][j];
            }
        }
        return newArr;
    }


    public Path traceMarkPath() {
        Path path = new Path();

        // currentIndexMat để chỉ trạng thái hiện tại
        IndexMatrix currentIndexMatrix = this;

        while (currentIndexMatrix != null) {

            // Thêm trạng thái hiện tại vào đường dẫn.
            path.addIndex(currentIndexMatrix);

            // Cập nhật giá trị của currentIndexMat để chỉ trạng thái cha của trạng thái hiện tại
            currentIndexMatrix = currentIndexMatrix.getParent();
        }
        return path;
    }


    @Override
    public int compareTo(IndexMatrix v) {
        return Integer.compare(this.getF(), v.getF());
    }

    @Override
    public String toString() {
        return ANSI_GREEN + "\t\tg = " + this.getG() + ", h = " + this.getH() + ", f = " + this.getF() + ANSI_RESET;
    }

    public String toArr() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr[0].length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                s.append(ANSI_GREEN + "\t\t").append(arr[i][j]).append(ANSI_RESET);
            }
            s.append("\n");
        }
        return s.toString();
    }
}
