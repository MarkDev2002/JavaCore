package Puzzle_AKT;

import java.util.ArrayList;

public class Path {
    private final ArrayList<IndexMatrix> path;

    public Path() {
        path = new ArrayList<>();
    }

    public void addIndex(IndexMatrix v) {
        this.path.add(v);
    }

    public void printPath() {
        for (int i = path.size() - 1; i >= 0; --i) {
            System.out.print(path.get(i).toString());
            System.out.println();
            System.out.print(path.get(i).toArr() + "\n");
        }
    }
}
