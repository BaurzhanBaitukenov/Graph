package com.company;

import java.util.List;

public class DirectedEdgeWeightedGraph {
    private ForDirectedVertex[] vertices;


    public DirectedEdgeWeightedGraph(int v){
        vertices = new ForDirectedVertex[v];
        for (int i = 0; i < v; i++) {
            vertices[i] = new ForDirectedVertex(i);
        }
    }

    public void addEdge(int v, int w, double weight){
        ForDirectedEdge edge = new ForDirectedEdge(v,w,weight);
        vertices[v].addEdge(edge);
        vertices[w].addEdge(edge);
    }

    public List<ForDirectedEdge> getAdj(int v){
        return vertices[v].getAdj();
    }






}
