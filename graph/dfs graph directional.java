/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Graph {
	public static void main (String[] args) {int v=6;
	
	ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>(v);
	for(int i=0;i<v;i++){
	    a.add(new ArrayList<Integer>());
	}
      addEdge(a,0,1);
        addEdge(a,0,2);
        addEdge(a,1,0);
        addEdge(a,1,3);
        addEdge(a,1,4);
        addEdge(a,2,0);
        addEdge(a,2,3);
        addEdge(a,3,2);
        addEdge(a,3,1);
        addEdge(a,4,1);
        addEdge(a,4,5);
        addEdge(a,5,4);
          

        dfs(a,v,0); 
	}
	static void addEdge(ArrayList<ArrayList<Integer>> a,int u,int v){
	    a.get(u).add(v);
	    //adj.get(v).add(u);
	}
	static void dfs(ArrayList<ArrayList<Integer>> a,int v,int s){
boolean[] visited=new boolean[v+1];
dfss(a,s,visited);
	}static void dfss(ArrayList<ArrayList<Integer>> a,int s,boolean[] visited){
	    visited[s]=true;
	    System.out.print(s+ " ");
	    for(int i:a.get(s)){
	        if(visited[i]==false){
	            dfss(a,i,visited);
	        }
	    }
	}
}