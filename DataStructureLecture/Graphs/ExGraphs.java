package DataStructureLecture.Graphs;

import java.util.*;

public class ExGraphs {
    public static void main(String[] args) {
        String[] nodes = { "A", "B", "C", "D", "E", "F" };
    int[][] myGraph = makeGraph(6,6);
        displayMat(myGraph);

        System.out.println(" ");
        add_edge(2,5,myGraph);
        displayMat(myGraph);

        System.out.println(" ");
        add_edge(5,5,myGraph);
        displayMat(myGraph);

        System.out.println(" ");
        add_edge(3,3,myGraph);
        displayMat(myGraph);

        System.out.println(" ");
        add_edge(1, 4, myGraph);
        displayMat(myGraph);

        System.out.println(" ");
        add_edge(3, 1, myGraph);
        displayMat(myGraph);
        int[][] graph = {
            //    A  B  C  D  E  F
                { 0, 0, 0, 0, 0, 0 }, // A
                { 0, 0, 1, 0, 0, 0 }, // B
                { 0, 0, 0, 0, 0, 0 }, // C
                { 0, 1, 0, 0, 1, 0 }, // D
                { 0, 0, 0, 0, 0, 1 }, // E
                { 1, 0, 0, 0, 0, 0 }  // F
        };

        boolean[] visited = new boolean[nodes.length];
        Queue<Integer> queue = new LinkedList<>();

        int startNode = 3; // Start from node D

        queue.add(startNode);
        visited[startNode] = true;

        while (queue.peek() != null) {

            int curr = queue.poll();
            System.out.println(nodes[curr]);

            for (int i = 0; i < nodes.length; i++) {
                if (myGraph[curr][i] == 1 && !visited[i]) {
                    visited[i] = true; // TODO 2: Mark the node as visited
                    queue.add(i); // TODO 3: Add the node to the queue
                }
            }
        }
    }


    public static void add_edge(int col, int row, int[][] mat){
        col = col - 1;
        row = row - 1;
        mat[row][col] = 1;
    }

    public static int[][] makeGraph(int col, int row) {
        int[][] result = new int[row][col];
//        for(int i = 0; i < row; i++) {
//            for(int j = 0; j < col; j++) {
//                result[i][j] = 0;
//            }
//        }

        return result;
    }

    public static void displayMat(int[][] mat){
        for(int[] y : mat) {
            for(int element : y){
                System.out.print(element + " ");
            }
            System.out.println(" ");
        }
    }
}