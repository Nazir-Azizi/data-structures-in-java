package com.data_structures.Graph;

import java.util.LinkedList;
import java.util.Queue;

class AdjacencyList{
    LinkedList<Integer>[] list;
    @SuppressWarnings("unchecked")
    AdjacencyList(int node){
        list = new LinkedList[node];
        for (int i = 0; i < node; ++i)
            list[i] = new LinkedList<>();
    }
    public void add(int a, int b){
        list[a].add(b);
        list[b].add(a);
    }
    public void display(){
        for (int i = 0; i < list.length; ++i){
            System.out.print(i + ": ");
            for (Integer neighbor: list[i])
                System.out.print(neighbor + " ");
            System.out.println();
        }
    }
    public void breadthFirstSearch(int vartix){
        boolean[] visited = new boolean[list.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[vartix] = true;
        queue.offer(vartix);
        while(!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u + " ");
            for (int v : list[u]){
                if (!visited[v]){
                    visited[v] = true;
                    queue.offer(v);
                }
            }
        }
    }
}