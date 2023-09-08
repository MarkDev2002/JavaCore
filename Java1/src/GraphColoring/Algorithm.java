package GraphColoring;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class Algorithm {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private final ArrayList<Vertex> vertices;

    public Algorithm(ArrayList<Vertex> vertices) {
        Collections.sort(vertices);
        this.vertices = vertices;
    }

    public void DSATUR() {

        ArrayList<Vertex> unColored = new ArrayList<>();
        ArrayList<Integer> colors = new ArrayList<>();

        int i = 0;
        while (i < vertices.size()) {
            // Thêm các đỉnh vào danh sách chưa tô màu
            unColored.add(vertices.get(i));

            // Thêm các màu vào danh sách tô màu
            colors.add(++i);
        }
        System.out.println(ANSI_RED + "\n\t\tTô màu theo thuật toán DSATUR" + ANSI_RESET);
        System.out.println("\t\t\t\t\tINITIAL");
        printVertices();
        format();

        while (!unColored.isEmpty()) {

            Vertex maxDegreeVertex = unColored.get(0);

            // Tô màu cho đỉnh đầu tiên
            int availableColor = maxDegreeVertex.getAvailableColor(colors);

            System.out.println(ANSI_YELLOW + "Chọn đỉnh : " + maxDegreeVertex.getLabel() + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Bậc : " + maxDegreeVertex.getDegree() + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Màu cấm tô : " + maxDegreeVertex.getBanColorsString() + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Màu tô : " + availableColor + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Các cạnh kề bị cấm tô màu " + availableColor + " : " + ANSI_RESET);


            // Vì đỉnh đã được tô màu nên không còn bất kỳ đỉnh liền kề nào không được tô màu nữa.
            maxDegreeVertex.setDegree(0);
            maxDegreeVertex.setColor(availableColor);

            // Duyệt qua các đỉnh kề với maxDegreeVertex
            for (Vertex v : maxDegreeVertex.getAdjacency()) {

                // Check đỉnh đang xét có nằm trong danh sách các đỉnh không được tô màu hay không
                if (unColored.contains(v)) {

                    // Nếu đỉnh đang xét không được tô màu, nó sẽ thêm các màu chưa được tô vào danh sách các màu bị cấm
                    v.getBanColors().add(availableColor);

                    // Nếu đỉnh đang xét đã tô màu
                    if (v.getDegree() == 0) {

                        // Bậc của đỉnh là 0
                        v.setDegree(0);
                    } else {

                        // Bậc giảm -1, vì một trong các đỉnh liền kề của nó có vừa được tô màu
                        v.setDegree(v.getDegree() - 1);
                    }
                    System.out.println("\t" + v);
                }
            }
            unColored.remove(0);
            System.out.println();
            printVertices();
            format();
        }

        printResult();
    }

    public void WelshPowell() {

        // Danh sách các đỉnh chưa được tô màu
        ArrayList<Vertex> unColored = new ArrayList<>();

        // Danh sách các màu có sẵn để tô màu các đỉnh
        ArrayList<Integer> colors = new ArrayList<>();


        int i = 0;
        while (i < vertices.size()) {

            // Thêm từng đỉnh vào danh sách chưa tô màu
            unColored.add(vertices.get(i));

            // Thêm các màu duy nhất vào danh sách màu
            colors.add(++i);
        }
        System.out.println(ANSI_RED + "\n\t\tTô màu theo thuật toán WelshPowell" + ANSI_RESET);
        System.out.println("\t\t\t\t\tINITIAL");
        printVertices();
        format();

        while (!unColored.isEmpty()) {

            Vertex maxDegreeVertex = unColored.get(0);

            int availableColor = maxDegreeVertex.getAvailableColor(colors);

            // Cấm màu đã tô, có thể tô cho các cạnh kề chưa được tô màu
            coloringByWelshPowell(maxDegreeVertex, unColored, availableColor);

            StringBuilder verticesColored = new StringBuilder();
            verticesColored.append(maxDegreeVertex.getLabel()).append(" ");

            // Lặp các đỉnh chưa được tô màu còn lại
            while (i < vertices.size()) {

                // Check đỉnh hiện tại có được tô màu ?
                Vertex v = unColored.get(i);

                if (!v.getBanColors().contains(availableColor)) {
                    // Nếu được tô màu xóa khỏi danh sách các đỉnh không được tô màu
                    coloringByWelshPowell(v, unColored, availableColor);
                    verticesColored.append(v.getLabel()).append(" ");
                } else {
                    // Nếu không được tô , chuyển sang đỉnh chưa được tô màu tiếp theo
                    ++i;
                }
            }

            System.out.println(ANSI_YELLOW + "\t\tChọn màu " + (availableColor) + " để tô đỉnh : " + verticesColored + ANSI_RESET);
            System.out.println();
            printVertices();
            format();
        }
        printResult();
    }

    // Tô màu cho đỉnh , cấm màu đã gán cho các đỉnh kề chưa được tô
    private void coloringByWelshPowell(Vertex v, ArrayList<Vertex> unColored, int color) {
        v.setColor(color);
        for (Vertex ver : v.getAdjacency()) {
            if (unColored.contains(ver)) {
                ver.getBanColors().add(color);
            }
        }

        // Đỉnh v được xóa khỏi danh sách các đỉnh không tô màu
        unColored.remove(v);
    }

    private void printVertices() {
        for (Vertex v : vertices) {
            System.out.println(v.toString());
        }
    }

    private void format() {
        System.out.println("\n====================================\n");
    }

    private void printResult() {
        System.out.println("\t\t\tRESULT");

        // Số lượng màu tối đa được sử dụng
        int maxColor = Collections.max(vertices, Comparator.comparing(Vertex::getColor)).getColor();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= maxColor; ++i) {
            result.setLength(0);
            result.append(ANSI_RED + "Màu ").append(i).append(" : ");
            for (Vertex v : vertices) {
                if (v.getColor() == i) {
                    result.append(ANSI_RED).append(v.getLabel()).append(" " + ANSI_RESET);
                }
            }
            System.out.println(result);
        }
    }
}
