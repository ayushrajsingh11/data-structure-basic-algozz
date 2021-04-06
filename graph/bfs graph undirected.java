/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Graph {
	public static void main (String[] args) {int v=4;
	
	ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(v);
	for(int i=0;i<v;i++){
	    adj.add(new ArrayList<Integer>());
	}
	addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,4);
        addEdge(adj,2,3);
        addEdge(adj,3,4);  
        bfs(adj,v,0);
	}
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
	    adj.get(u).add(v);
	    adj.get(v).add(u);
	}
	static void bfs(ArrayList<ArrayList<Integer>> adj,int v,int s){
	    boolean[] visited=new boolean[v+1];
	    Queue<Integer> q=new LinkedList<>();
	    visited[s]=true;
	    q.add(s);
	    while(q.isEmpty()==false){
	        int curr=q.poll();
	        System.out.print(curr+" ");
	        for(int x:adj.get(curr)){
	            if(visited[x]==false){
	                visited[x]=true;
	                q.add(x);
	            }
	        }
	    }
	}
}