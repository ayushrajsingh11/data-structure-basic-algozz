// Java code for printing Minimum Cost
// Simple Path between two given nodes
// in a directed and weighted graph
import java.util.*;
import java.lang.*;
 
class GFG{
   
static int INF = Integer.MAX_VALUE;
    public static void main(String[] args)
{
      int V = 10;
    // Initialising the graph
    int graph[][] = new int[V][V];
    for(int i = 0; i < V; i++)
    {
        for(int j = 0; j < V; j++)
        {
            graph[i][j] = INF;
        }
    }
     
    // Marking all nodes as unvisited
    boolean visited[] = new boolean[V];
     
    // Initialising the edges;
    graph[2][9] = 2;
    graph[7][2] = 3;
    graph[7][9] = 7;
    graph[9][5] = 1;
    
     
    // Source and destination
    int s = 7, t = 9;
     
    // Marking the source as visited
    visited[s] = true;
     
    System.out.println(minimumCostSimplePath(s, t,
                            visited, graph,V));
}
     
// Define number of vertices in
// the graph and infinite value

 
// Function to do DFS through the nodes
static int minimumCostSimplePath(int u, int destination,
                                 boolean visited[],
                                 int graph[][],int V)
{
     
    // Check if we find the destination
    // then further cost will be 0
    if (u == destination)
        return 0;
         
    // Marking the current node as visited
    visited[u] = true;
 
    int ans = INF;
 
    // Traverse through all
    // the adjacent nodes
    for(int i = 0; i < V; i++)
    {
        if (graph[u][i] != INF && !visited[i])
        {
             
            // Cost of the further path
            int curr = minimumCostSimplePath(i,
                        destination, visited, graph,V);
 
            // Check if we have reached the
            // destination
            if (curr < INF)
            {
                 
                // Taking the minimum cost path
                ans = Math.min(ans, graph[u][i] + curr);
            }
        }
    }
 
    // Unmarking the current node
    // to make it available for other
    // simple paths
    visited[u] = false;
 
    // Returning the minimum cost
    return ans;
}  
 
// Driver code

}