package Algorithm_Datastructe.Graph;

import java.util.LinkedList;

public class CrossRiverBFS {
    private LinkedList<Integer>[] adj;

    public CrossRiverBFS(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void checkBFS(int s) {
        boolean[] visited = new boolean[adj.length];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {

            s = queue.poll();
            switch (s) {
                case 0 -> System.out.print("(0,0)\t");
                case 1 -> System.out.print("(4,0)\t");
                case 2 -> System.out.print("(0,3)\t");
                case 3 -> System.out.print("(4,3)\t");
                case 4 -> System.out.print("(1,3)\t");
                case 5 -> System.out.print("(1,0)\t");
                case 6 -> System.out.print("(0,1)\t");
                case 7 -> System.out.print("(4,1)\t");
                case 8 -> System.out.print("(2,3)\t");
                case 9 -> System.out.print("(3,0)\t");
                case 10 -> System.out.print("(3,3)\t");
                case 11 -> System.out.print("(4,2)\t");
                default -> System.out.print("Error");
            }

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        CrossRiverBFS bfs = new CrossRiverBFS(7);

//        bfs.addEdge(1, 2);
//        bfs.addEdge(1, 3);
//        bfs.addEdge(1, 5);
//        bfs.addEdge(1, 10);
//        bfs.addEdge(2, 1);
//        bfs.addEdge(2, 4);
//        bfs.addEdge(3, 1);
//        bfs.addEdge(3, 6);
//        bfs.addEdge(3, 7);
//        bfs.addEdge(3, 9);
//        bfs.addEdge(5, 1);
//        bfs.addEdge(5, 8);
//        bfs.addEdge(8, 5);
//        bfs.addEdge(8, 9);
//        bfs.addEdge(9, 8);
//        bfs.addEdge(10, 1);

//        bfs.addEdge(1, 2);
//        bfs.addEdge(1, 10);
//        bfs.addEdge(1, 7);
//        bfs.addEdge(2, 3);
//        bfs.addEdge(2, 6);
//        bfs.addEdge(3, 4);
//        bfs.addEdge(3, 5);
//        bfs.addEdge(4, 3);
//        bfs.addEdge(5, 3);
//        bfs.addEdge(6, 2);
//        bfs.addEdge(7, 1);
//        bfs.addEdge(7, 8);
//        bfs.addEdge(8, 7);
//        bfs.addEdge(8, 9);
//        bfs.addEdge(9, 8);
//        bfs.addEdge(10, 1);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);

        bfs.addEdge(1, 0);
        bfs.addEdge(1, 3);
        bfs.addEdge(1, 4);

        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(2, 9);

        bfs.addEdge(3, 1);
        bfs.addEdge(3, 2);

        bfs.addEdge(4, 1);
        bfs.addEdge(4, 2);
        bfs.addEdge(4, 3);
        bfs.addEdge(4, 5);

        bfs.addEdge(5, 0);
        bfs.addEdge(5, 1);
        bfs.addEdge(5, 4);
        bfs.addEdge(5, 6);

        bfs.addEdge(6, 0);
        bfs.addEdge(6, 2);
        bfs.addEdge(6, 5);
        bfs.addEdge(6, 7);

        bfs.addEdge(7, 1);
        bfs.addEdge(7, 3);
        bfs.addEdge(7, 6);
        bfs.addEdge(7, 8);

        bfs.addEdge(9, 0);
        bfs.addEdge(9, 1);
        bfs.addEdge(9, 2);
        bfs.addEdge(9, 10);

        bfs.addEdge(10, 2);
        bfs.addEdge(10, 3);
        bfs.addEdge(10, 9);
        bfs.addEdge(10, 11);

        System.out.println("BFS (starting from vertex 0) : ");

        bfs.checkBFS(0);


    }
}
