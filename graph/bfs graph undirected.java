/*package whatever //do not write package name here */
import java.util.*;
import java.io.*;

class Graph {
	public static void main (String[] args) {int v=5;
	
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
	    visited[s]=true;// source is visited first
	    q.add(s);// source is added to the queue
	    while(q.isEmpty()==false){
	        int curr=q.poll();//source is stored and is taken out of the queue
	        System.out.print(curr+" ");//current vertex is printed
	        for(int x:adj.get(curr)){//source ke connected vertices are visited 
	            if(visited[x]==false){//will only work if its not visited before 
	                visited[x]=true;//all the connected vetices are visited here 
	                q.add(x);//and added to the queue for the next curr vertex will become the source
	            }
	        }
	    }
	}
}
