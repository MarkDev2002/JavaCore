package GraphColoring;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {

    private final String label;
    private int color;
    private int degree;
    private final ArrayList<Integer> banColors;
    private final ArrayList<Vertex> adjacency;

    public Vertex(String label) {
        this.label = label;
        this.color = 0;
        this.degree = 0;
        this.banColors = new ArrayList<>();
        this.adjacency = new ArrayList<>();
    }

    public String getLabel() {
        return label;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public ArrayList<Integer> getBanColors() {
        return banColors;
    }

    public ArrayList<Vertex> getAdjacency() {
        return adjacency;
    }

    public void addAdjacency(Vertex v) {
        adjacency.add(v);
        setDegree(adjacency.size());
    }

    @Override
    public int compareTo(Vertex v) {
        return Integer.compare(v.getDegree(), this.getDegree());
    }

    public int getAvailableColor(ArrayList<Integer> colors) {
        int availableColor = 0;
        for (int cancol : colors) {
            if (!getBanColors().contains(cancol)) {
                availableColor = cancol;
                break;
            }
        }
        return availableColor;
    }

    public String getBanColorsString() {
        if (this.getBanColors().isEmpty()) {
            return "Không có";
        } else {
            ArrayList<Integer> banColorList = this.getBanColors();
            StringBuilder result = new StringBuilder();
            for (Integer integer : banColorList) {
                result.append(integer).append(" ");
            }
            return result.toString();
        }
    }

    @Override
    public String toString() {
        return "Đỉnh : " + getLabel() + " -- " + "Màu tô : " + getColor() +
                " -- " + "Bậc : " + getDegree() + " -- " + "Màu cấm tô : " + getBanColorsString();
    }
}
