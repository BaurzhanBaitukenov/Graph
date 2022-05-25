package com.company;

import java.util.ArrayList;
import java.util.List;

public class ForDirectedVertex {
    private int id;
    private List<ForDirectedEdge> adjEdgeList = new ArrayList<>();

    public ForDirectedVertex(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addEdge(ForDirectedEdge edge){
        adjEdgeList.add(edge);
    }

    public List<ForDirectedEdge> getAdj(){
        return adjEdgeList;
    }

}
