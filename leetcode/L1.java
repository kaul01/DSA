import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class L1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(!map.isEmpty() && map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]) , i};
            }else{
                map.put(target-nums[i],i);
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Two sum: " + Arrays.toString(result));
    }
}
