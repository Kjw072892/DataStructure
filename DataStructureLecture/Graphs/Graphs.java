//package DataStructureLecture.Graphs;
//
//import java.util.*;
//
//public class ExGraphs {
//    public static void main(String[] args) {
//        String[] nodes = { "A", "B", "C", "D", "E", "F" };
//        int[][] graph = {
//            //    A  B  C  D  E  F
//                { 0, 0, 0, 0, 0, 0 }, // A
//                { 0, 0, 1, 0, 0, 0 }, // B
//                { 0, 0, 0, 0, 0, 0 }, // C
//                { 0, 1, 0, 0, 1, 0 }, // D
//                { 0, 0, 0, 0, 0, 1 }, // E
//                { 1, 0, 0, 0, 0, 0 }  // F
//        };
//
//        boolean[] visited = new boolean[nodes.length];
//        Queue<Integer> queue = new LinkedList<>();
//
//        int startNode = 3; // Start from node D
//
//        queue.add(startNode);
//        visited[startNode] = true;
//
//        while (???) { // TODO 1: Complete the condition for the while loop
//            int curr = queue.poll();
//            System.out.println(nodes[curr]);
//
//            for (int i = 0; i < nodes.length; i++) {
//                if (graph[curr][i] == 1 && !visited[i]) {
//                    visited[i] = ???; // TODO 2: Mark the node as visited
//                    queue.???; // TODO 3: Add the node to the queue
//                }
//            }
//        }
//    }
//}