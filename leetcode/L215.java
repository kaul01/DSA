import java.util.*;
public class L215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : nums){
            pq.offer(i);
            if(pq.size() > k)pq.poll();
        }

        return pq.peek();
    }
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}
