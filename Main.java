package com.company;
import java.util.List;
public class Main {

    public static void main(String[] args) {
    DirectedEdgeWeightedGraph g = new DirectedEdgeWeightedGraph(3);
    g.addEdge(0,1,5);
    g.addEdge(1,2,6);
    g.addEdge(0,2,7);

    List<ForDirectedEdge> adj =  g.getAdj(2);
        for (ForDirectedEdge edge : adj) {
            System.out.println(String.valueOf(edge));
        }

        System.out.println();

    UndirectedGraph dg = new UndirectedGraph(4);
    dg.addEdge(0,1);
    dg.addEdge(1,2);
    dg.addEdge(2,3);
    dg.addEdge(3,0);

    //dg.DFS(0);
    //dg.BFS(0);

    }

}
