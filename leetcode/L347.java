import java.util.*;
public class L347 {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int[] res = new int[k];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.offer(new int[]{e.getKey(), e.getValue()});
        }
        for(int i=0 ; i<k ; i++){
            res[i] = pq.poll()[0];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] res = topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
