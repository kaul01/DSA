package graphs;

import java.util.*;

import java.util.ArrayList;

class Pair implements Comparable<Pair> {
    int v;
    int wt;

    Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }

    public int compareTo(Pair that){
        return this.wt - that.wt;
    }
}

public class dijkstra {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();
        ArrayList<Integer> node = new ArrayList<>();
        for (int i=0 ; i< 6 ; i++){
            graph.add(new ArrayList<ArrayList<Integer>>());
        }
        addEdge(graph, 0, 3, 2);
        addEdge(graph, 0, 2, 4);
        addEdge(graph, 2, 3, 3);
        addEdge(graph, 3, 5, 1);
        addEdge(graph, 2, 5, 1);
        addEdge(graph, 2, 1, 9);
        addEdge(graph,1, 4, 1);
        addEdge(graph, 4, 5, 2);

        for(int i=0 ; i<graph.size() ; i++){
            ArrayList<ArrayList<Integer>> row = graph.get(i);
            System.out.println(row);
        }

        int [] distance = distance(graph, 0);
        for(int i: distance){
            System.out.println(i + " ");
        }
    }

    public static void addEdge(ArrayList<ArrayList<ArrayList<Integer>>> graph, int source, int destination, int wt){
        graph.get(source).add(new ArrayList<Integer>(Arrays.asList(destination, wt)));
        graph.get(destination).add(new ArrayList<Integer>(Arrays.asList(source, wt)));
    }

    public static int[] distance (ArrayList<ArrayList<ArrayList<Integer>>> graph, int source){
        int v = graph.size();
        boolean vis[] = new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source,0));

        int ans[] = new int[v];
        Arrays.fill(ans, 10000);
        ans[source] = 0;

        while(!pq.isEmpty()){
            Pair cur = pq.remove();
            int cur_v = cur.v;
            if(vis[cur_v]) continue;

            vis[cur_v] = true;

            ArrayList<ArrayList<Integer>> neighbours = graph.get(cur_v);
            for(ArrayList<Integer> neighbour : neighbours){
                int vertex = neighbour.get(0);
                int weight = neighbour.get(1);
                if(ans[vertex] > ans[cur_v] + weight){
                    ans[vertex] = ans[cur_v] + weight;
                    pq.add(new Pair(vertex, ans[vertex]));
                }
            }
        }


        return ans;
    }

    
}
