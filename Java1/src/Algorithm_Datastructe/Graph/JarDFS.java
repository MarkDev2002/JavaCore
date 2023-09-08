package Algorithm_Datastructe.Graph;

import java.util.LinkedList;

public class JarDFS {
    private LinkedList<Integer>[] adj;
    private boolean[] visited;

    public JarDFS(int v) {
        adj = new LinkedList[v];
        visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {

        adj[v].add(w);
    }

    public void checkDFS(int v) {
        visited[v] = true;

        switch (v) {
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
            case 11 -> System.out.print("(4,2)\n");
            default -> System.out.print("Error");
        }


        for (int n : adj[v]) {

            if (!visited[n]) {
                checkDFS(n);
            }
        }
    }


    public static void main(String[] args) {
        JarDFS dfs = new JarDFS(12);

//        dfs.addEdge(1, 2);
//        dfs.addEdge(1, 10);
//        dfs.addEdge(1, 7);
//        dfs.addEdge(2, 3);
//        dfs.addEdge(2, 6);
//        dfs.addEdge(3, 4);
//        dfs.addEdge(3, 5);
//        dfs.addEdge(4, 3);
//        dfs.addEdge(5, 3);
//        dfs.addEdge(6, 2);
//        dfs.addEdge(7, 1);
//        dfs.addEdge(7, 8);
//        dfs.addEdge(8, 7);
//        dfs.addEdge(8, 9);
//        dfs.addEdge(9, 8);
//        dfs.addEdge(10, 1);


        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);

        dfs.addEdge(1, 0);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);

        dfs.addEdge(2, 0);
        dfs.addEdge(2, 3);
        dfs.addEdge(2, 9);

        dfs.addEdge(3, 1);
        dfs.addEdge(3, 2);

        dfs.addEdge(4, 1);
        dfs.addEdge(4, 2);
        dfs.addEdge(4, 3);
        dfs.addEdge(4, 5);

        dfs.addEdge(5, 0);
        dfs.addEdge(5, 1);
        dfs.addEdge(5, 4);
        dfs.addEdge(5, 6);

        dfs.addEdge(6, 0);
        dfs.addEdge(6, 2);
        dfs.addEdge(6, 5);
        dfs.addEdge(6, 7);

        dfs.addEdge(7, 1);
        dfs.addEdge(7, 3);
        dfs.addEdge(7, 6);
        dfs.addEdge(7, 8);

        dfs.addEdge(9, 0);
        dfs.addEdge(9, 1);
        dfs.addEdge(9, 2);
        dfs.addEdge(9, 10);

        dfs.addEdge(10, 2);
        dfs.addEdge(10, 3);
        dfs.addEdge(10, 9);
        dfs.addEdge(10, 11);
        System.out.println("Following is Depth First Traversal (starting from vertex 0)");

        dfs.checkDFS(0);
    }


}