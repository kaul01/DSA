
import java.util.*;

public class bfs_dfs {

    public static void addEdge(ArrayList<ArrayList<Integer>> graph, int source, int destination){
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    public static ArrayList<ArrayList<Integer>> makeGraph(){

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=1 ; i<= 6 ; i++){
            graph.add(new ArrayList<Integer>());
        }
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 5);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 4, 6);
        addEdge(graph, 6, 5);
        addEdge(graph, 2, 5);

        return graph;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = makeGraph();
        for(int i=0 ; i<graph.size() ; i++){
            for(int j=0 ; j<graph.get(i).size() ; j++){
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
