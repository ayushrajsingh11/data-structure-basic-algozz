/* IMPORTANT: Multiple classes and nested static classes are supported */


//imports for BufferedReader

import java.io.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Graph {
    private int V;
    private LinkedList<Integer> adj[];
Graph(int v){
    V=v;
    adj=new LinkedList[v];
    for(int i=0;i<v;++i)
    adj[i]=new LinkedList();
    }
    void addEdge(int v,int w){adj[v].add(w);}
    Boolean isReachable(int s,int d){
        LinkedList<Integer> temp;
        boolean visited[]=new boolean[V];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        Iterator<Integer> i;
        while(queue.size()!=0){
            s=queue.poll();
            int n;
            i=adj[s].listIterator();
            while(i.hasNext()){
                n=i.next();
                if(n==d)
                return true;
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }

        }
        return false;

    }
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        

        ArrayList<Integer> some=new ArrayList<>();

        for(int i=0;i<N;i++){
           some.add(sc.nextInt());
        }Graph g=new Graph(Collections.max(some)+1);
        int E=sc.nextInt();
        int[][] a=new int[E][2];
        for(int i=0;i<E;i++){
           a[i][0]=sc.nextInt();
           a[i][1]=sc.nextInt();
           g.addEdge(a[i][0],a[i][1]);
        }
        int A=sc.nextInt();
        int B=sc.nextInt();
        if(g.isReachable(A,B))
        System.out.print(1);
        else
        System.out.print(0);
        



    }
}
