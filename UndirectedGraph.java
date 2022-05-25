package com.company;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class UndirectedGraph {
    private LinkedList<Integer>[]adj;
    private int V; // number of vertices
    private int E; // number of edges

    public UndirectedGraph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }


    public void BFS(int source){ 
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.offer((source)); 

        while(!q.isEmpty()){
            int u = q.poll(); 
            System.out.println(u + " ");

            for (int v : adj[u]) {
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }


    public void DFS(int source){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.println(u + " ");
                for (int v : adj[u]) {
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+ " vertices, " + E + " edges " + "\n");
        for (int i = 0; i < V; i++) {
            sb.append(i +"--> ");
            for (int w : adj[i]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}
