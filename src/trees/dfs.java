package trees;

import java.util.*;

public class dfs {

    static class Graph{
        int V;
        LinkedList<Integer> adj_list [];

        Graph (int v) {
            V=v;
            int i=0;
            adj_list = new LinkedList[v];
            for (i=0; i <v; ++i) {
                adj_list[i] = new LinkedList();
            }
        }

        void addEdge(int v, int w){
            adj_list[v].add(w);
        }

        void dfsUtils(int st, boolean[] visited) {

            visited[st] = true;
            System.out.println(st);
//            LinkedList <Integer> neighbours = adj_list[st];
            Iterator<Integer> i =  adj_list[st].iterator();
            while (i.hasNext()){
                int n  = i.next();
                if (!visited[n]){
                    dfsUtils(n, visited);
                }
            }
        }
        void find_dfs(){
            boolean[] visited = new boolean[V];
            for (int i=0; i<V; ++i){
                if (visited[i] == false) {
                    dfsUtils(i, visited );
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.find_dfs();

    }
}
