package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
    private LinkedList<Integer> adj[];

    public Graph(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v;i++){
            adj[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public int dfs(int source, int destination){
        int distance = 0;
        boolean visited[]= new boolean[adj.length];
        int parent[] = new int[adj.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        parent[source] = -1;
        visited[source] = true;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(source == destination) break;
            for (int neighbor: adj[cur]) {
                 if(!visited[neighbor]){
                     visited[neighbor] = true;
                     q.add(neighbor);
                     parent[neighbor] = cur;
                 }
            }
        }
        int cur = destination;
        while(parent[cur] != -1){
            System.out.print(cur + " ->");
            cur = parent[cur];
            distance++;
        }
        System.out.print(cur);
        System.out.println();
    return distance;
    }

//    Enter number of vertices and edges in Graph
//5 6
//    Enter 6edges
//0 1
//        1 2
//        2 3
//        3 4
//        0 4
//        2 4

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges in Graph");
        int v = sc.nextInt();
        int e = sc.nextInt();

        Graph graph = new Graph(v);
        System.out.println("Enter "+ e+ "edges");
        for(int i=0;i<e;i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }

        System.out.println(graph.dfs(0,3));
    }
}
