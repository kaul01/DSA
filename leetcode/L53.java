public class L53 {
    public static int maxSubArray(int[] nums) {
        int curSum=nums[0];
        int maxSum=nums[0];
        for(int i=1 ; i<nums.length ; i++){
            if(curSum < 0){
                curSum = nums[i];
            }else{
                curSum += nums[i];
            }

            if(curSum > maxSum){
                maxSum = curSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result);
    }
}
