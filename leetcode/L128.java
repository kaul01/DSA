import java.util.HashSet;
import java.util.Set;
public class L128 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }

        int maxStreak=0;
        for(int i:set){
            if(set.contains(i-1)) continue;
            int curNum = i;
            int curStreak=0;
            while(set.contains(curNum)){
                curStreak++;
                curNum++;
            }
            if(curStreak > maxStreak) maxStreak = curStreak;
        }
        return maxStreak;
    } 
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence: " + result);
    }
}
