/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main{
    private final int V;
    private final List<List<Integer>> adj;
    
    public Main(int v){
        this.V=v;
        adj=new ArrayList<>();
    for(int i=0;i<v;i++)
        adj.add(new LinkedList<Integer>());
    }
    // for directed(uni directed) ->
    private void addEdge(int s,int d){
        adj.get(s).add(d);
    }
    private boolean iscyclicmain(int i ,boolean[] visited ,boolean[] recStack){
       
       if (recStack[i])
            return true;
 
        if (visited[i])
            return false;
             
        visited[i] = true;
 
        recStack[i] = true;
        List<Integer> children = adj.get(i);
         
        for (Integer c: children)
            if (iscyclicmain(c, visited, recStack))
                return true;
                 
        recStack[i] = false;
 
        return false;
        
    }
    private boolean iscyclic(){
        boolean[] visited=new boolean[V];
        boolean[] recstack=new boolean[V];
        
        for(int i=0;i<V;i++)
            if(iscyclicmain(i,visited,recstack))
            return true ;
            return false;
        
        
    }
        public static void main(String[] args){
            Main g=new Main(4);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(1,2);
            g.addEdge(2,0);
            g.addEdge(2,3);
            g.addEdge(3,3);
            if(g.iscyclic()){
                System.out.println("cycle");
            }else System.out.println("no cycle");
        }
    
}
