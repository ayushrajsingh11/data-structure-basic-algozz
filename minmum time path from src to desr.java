import java.io.*;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    static int INF=Integer.MAX_VALUE;
    public static void main(String args[] ) throws Exception {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  ArrayList<Integer> some=new ArrayList<>();
  for(int i=0;i<n;i++){
      some.add( sc.nextInt());
  }
  int V=Collections.max(some)+1;
  int graph[][]=new int[V][V];
  int E=sc.nextInt();
  int a[][]=new int[E][3];
  for(int i=0;i<V;i++){
      for(int j=0;j<V;j++){
      graph[i][j]=INF;
  } 
  }
  boolean visited[] = new boolean[V];
  for(int i=0;i<E;i++){
      a[i][0]=sc.nextInt();
      a[i][1]=sc.nextInt();
      a[i][2]=sc.nextInt();
      int ft=a[i][0];
      int lt=a[i][1];
      int t=a[i][2];
      graph[ft][lt]=t;
  }
  int A=sc.nextInt();
  int B=sc.nextInt();
  visited[A]=true;
  System.out.println(mintime(A,B,visited,graph,V));   

    }
    static int mintime(int u,int destination,boolean visited[],int graph[][],int V){
        if(u==destination)
        return 0;
        visited[u]=true;
        int ans=INF;
        for(int i=0;i<V;i++){
            if(graph[u][i]!=INF&&!visited[i]){
            int curr=mintime(i, destination, visited, graph, V);
        if(curr<INF){
            ans=Math.min(ans,graph[u][i]+curr);
        }
        }
        }
        visited[u]=false;
        return ans;
    }
}