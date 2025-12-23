public class L169 {
    public static int majorityElement(int[] nums) {
        int curCount=0;
        int maxNum=0;
        for(int i:nums){
            if(curCount == 0){
                maxNum = i;
                curCount++;
            }else if(maxNum == i){
                curCount++;
            }else{
                curCount--;
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int result = majorityElement(nums);
        System.out.println("Majority element: " + result);
    }
}
