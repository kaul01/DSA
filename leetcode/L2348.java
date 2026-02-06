public class L2348 {
    public static long zeroFilledSubarray(int[] nums) {
        long ct=0l;
        long curCt=0l;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                curCt++;
            }else{
                ct = ct + ((curCt)*(curCt+1)/2);
                curCt = 0;
            }
        }
        if(curCt > 0){
            ct = ct + ((curCt)*(curCt+1)/2);
        }
        return ct;
    }
    public static void main(String[] args) {
        System.out.println(zeroFilledSubarray(new int[]{1,3,0,0,2,0,0,4}));
    }
}
