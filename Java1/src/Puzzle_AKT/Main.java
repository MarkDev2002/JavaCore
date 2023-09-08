package Puzzle_AKT;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void AKT(IndexMatrix startIndexMatrix, IndexMatrix endIndexMatrix) {

        PriorityQueue<IndexMatrix> openList = new PriorityQueue<>();
        ArrayList<IndexMatrix> closeList = new ArrayList<>();
        openList.add(startIndexMatrix);

        int i = 1;
        while (!openList.isEmpty()) {
            System.out.println(ANSI_YELLOW + "\nSTEP " + i + " : " + ANSI_RESET);
            System.out.print(ANSI_RED + "\n\t\t\t\tOPEN\n" + ANSI_RESET);
            for (IndexMatrix v : openList) {
                System.out.println("\n" + v.toString());
                System.out.println(v.toArr());

            }

            System.out.print(ANSI_RED + "\n\t\t\t\tCLOSED\n" + ANSI_RESET);
            for (IndexMatrix v : closeList) {
                System.out.println("\n" + v.toString());
                System.out.println(v.toArr());
            }
            System.out.println();
            format();

            // Lấy ra trạng thái có tổng chi phí (f) thấp nhất khỏi danh sách open
            IndexMatrix currentIndexMatrix = openList.poll();

            // Thêm trạng thái có tổng chi phí (f) thấp nhất vào danh sách close
            closeList.add(currentIndexMatrix);


            if (currentIndexMatrix.getH() == 0) {
                format();
                System.out.println(ANSI_RED + "\t\tĐường đi đến đích : \n" + ANSI_RESET);
                currentIndexMatrix.traceMarkPath().printPath();
                break;
            } else {
                IndexMatrix topIndexMatrix = currentIndexMatrix.goTop();
                IndexMatrix bottomIndexMatrix = currentIndexMatrix.goBottom();
                IndexMatrix leftIndexMatrix = currentIndexMatrix.goLeft();
                IndexMatrix rightIndexMatrix = currentIndexMatrix.goRight();

                currentIndexMatrix.adjacency(topIndexMatrix, endIndexMatrix);
                currentIndexMatrix.adjacency(bottomIndexMatrix, endIndexMatrix);
                currentIndexMatrix.adjacency(leftIndexMatrix, endIndexMatrix);
                currentIndexMatrix.adjacency(rightIndexMatrix, endIndexMatrix);

                // Kiểm tra xem các nút liền kề đã được truy cập chưa
                for (IndexMatrix v : currentIndexMatrix.getAdjacency()) {
                    // Check xem nó có tồn tại trong danh sách open hay close
                    if (!checkStateExist(openList, closeList, v)) {
                        // Nếu chưa được truy cập add vào danh sách open
                        openList.add(v);
                    }
                }
                // tiếp tục các bước cho đến khi tìm thấy đường đi ngắn nhất đến đích
                // hoặc sử dụng hết tất cả các đường dẫn có thể
                ++i;
            }
        }

    }

    // Check xem "IndexMatrix" có tồn tại trong tập open hay close chưa
    private static boolean checkStateExist(PriorityQueue<IndexMatrix> openList, ArrayList<IndexMatrix> closeList, IndexMatrix checkIndexMatrix) {
        for (IndexMatrix v : openList) {
            if (IndexMatrix.compareArr(v.getArr(), checkIndexMatrix.getArr())) {
                return true;
            }
        }
        for (IndexMatrix v : closeList) {
            if (IndexMatrix.compareArr(v.getArr(), checkIndexMatrix.getArr())) {
                return true;
            }
        }
        return false;
    }

    private static void format() {
        System.out.println("\n====================================\n");
    }

    public static void main(String[] args) {
        int[][] arrStart = {{2, 8, 3}, {1, 6, 4}, {7, 0, 5}};
        int[][] arrEnd = {{1, 2, 3}, {8, 0, 4}, {7, 6, 5}};

        IndexMatrix Start = new IndexMatrix(arrStart, 0, 4, 4);
        IndexMatrix End = new IndexMatrix(arrEnd, 0, 0, 0);

        AKT(Start, End);
    }
}
