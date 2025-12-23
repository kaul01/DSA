import java.util.*;
public class L56 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int curStart = -1;
        int curEnd = -1;
    
        for(int[] i : intervals){
            if(curEnd == -1){
                curStart = i[0];
                curEnd = i[1];
            }else{
                if(i[0] <= curEnd){
                    curEnd = Math.max(i[1], curEnd);
                }else{
                    res.add(new int[]{curStart, curEnd});
                    curStart = i[0];
                    curEnd = i[1];
                }
            }
        }
        res.add(new int[]{curStart, curEnd});
        return res.toArray(new int[0][]);   
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}