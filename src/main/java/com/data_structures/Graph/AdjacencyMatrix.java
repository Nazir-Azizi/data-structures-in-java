package com.data_structures.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyMatrix{
    int[][] matrix;
    AdjacencyMatrix(int nodes){
        this.matrix = new int[nodes][nodes];
    }
    public void add(int a, int b){
        if (a < matrix.length && b < matrix.length)
            matrix[b][a] = matrix[a][b] = 1;
        
    }
    public void display(){
        for (int i = 0; i < matrix.length; ++i){
            for(int j = 0; j < matrix.length; ++j)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    public void breadthFirstSearch(int vartix){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        visited[vartix] = true;
        queue.offer(vartix);

        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u + " ");

            // Arrays.stream(matrix[u]).forEach(e -> System.out.print(e + " "));
            System.out.println();
            for (int v = 0; v < matrix[u].length; v++){
                if (!visited[v] && matrix[u][v] != 0){
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
}