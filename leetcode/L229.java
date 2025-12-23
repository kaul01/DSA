import java.util.ArrayList;
import java.util.List;
public class L229 {
    public static List<Integer> majorityElement(int[] nums) {
        int c1=0;
        int c2=0;
        int n1=0;
        int n2=0;

        for(int i:nums){
            if(n1 == i){
                c1++;
            }else if(n2 == i){
                c2++;
            } else if(c1 == 0){
                n1 = i;
                c1++;
            } else if(c2 == 0){
                n2 = i;
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        List<Integer> ans = new ArrayList<>();
        c1=0;
        c2=0;
        for(int n:nums){
            if(n1 == n)c1++;
            else if(n2 == n)c2++;
        }
        if(c1 > nums.length/3){
            ans.add(n1);
        }
        if(c2 > nums.length/3){
            ans.add(n2);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 4, 2, 2, 2};
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority elements: " + result);
    }
}
