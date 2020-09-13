package trees;

import java.util.Iterator;
import java.util.LinkedList;


public class bfs {
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
        void find_bfs(int s){
            boolean[] visited = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<Integer>();

            visited[s] = true;
            queue.add(s);
            while (queue.size() != 0) {
                int v = queue.poll();
                System.out.print(v + " ");
                LinkedList <Integer> neighbours = adj_list[v];
                Iterator<Integer> i = neighbours.iterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if(!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Graph gr = new Graph(4);
        gr.addEdge(0, 1);
        gr.addEdge(0,2);
        gr.addEdge(1,2);
        gr.addEdge(2,0);
        gr.addEdge(2,3);
        gr.addEdge(3,3);
        gr.find_bfs(2);

    }
}
