import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class L18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int new_target = target - nums[i] - nums[j];
                int front = j+1;
                int back = n-1;
                while(front < back){
                    int two_sum = nums[front] + nums[back];
                    if(two_sum < new_target)front++;
                    else if(two_sum > new_target)back--;
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[front]);
                        list.add(nums[back]);
                        res.add(list);
                        while(front < back && nums[front] == list.get(2))front++;
                        while(front < back && nums[back] == list.get(3))back--;
                    }
                }
                while(j+1 < n && nums[j] == nums[j+1])j++;
            }
            while(i+1 < n && nums[i] == nums[i+1])i++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println("Four sum: " + result);
    }
}
