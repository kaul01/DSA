public class L3379 {
    public static int[] constructTransformedArray(int[] nums) {
        int[] res = new int[nums.length];

        for(int i=0 ; i<nums.length ; i++){
            int idx = i + nums[i];
            idx = idx%nums.length;
            if(idx < 0){
                idx = idx + nums.length;
            }
            res[i] = nums[idx];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] res = constructTransformedArray(new int[]{3,-2,1,1});
        for(int i:res){
            System.out.print(i + " ");
        }
    }
}
