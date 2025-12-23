

import java.util.*;

public class bellmanFord {
    public static void main(String[] args) {
        int[][] edges = {{0,1,-1},{1,2,-2},{2,0,-3}};
        int[][] edges_2 = {{0,1,-1},{1,2,-2},{2,0,3}};
        System.out.println("Hellooooo");
        int V=3;
        System.out.println(isNegativeWeightCycle(V, edges_2));

        double n = 49;
        double n2 = 4;
        double n3 = n/n2;
        System.out.println(n3);
    }

    public static int isNegativeWeightCycle(int V, int[][] edges){
        int[] minDistance = new int[V+1];
        Arrays.fill(minDistance, 10000);
        minDistance[0] = 0;
        for(int i=0 ; i<V ; i++){
            for(int j=0 ; j<edges.length ; j++){
                int s = edges[j][0];
                int d = edges[j][1];
                int wt = edges[j][2];
                if(minDistance[d] > minDistance[s] + wt){
                    if(i == V-1){
                        return 1;
                    }
                    minDistance[d] = minDistance[s] + wt;
                }
            }
        }
        return 0;
    }
}
