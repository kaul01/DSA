public class L2460 {
    public static int[] applyOperations(int[] nums) {
        for(int i=0 ; i<nums.length-1 ; ){
         if(nums[i] == nums[i+1]){
             nums[i] = 2*nums[i];
             nums[i+1] = 0;
             i += 2;
         }else{
             i++;
         }
        } 
        int j=0;
        for(int i=0 ; i<nums.length ; i++){
         if(nums[i] != 0){
             nums[j++] = nums[i];
         }
        }
 
        for( ; j<nums.length ; ){
         nums[j++] = 0;
        }
 
        return nums;
     }
     public static void main(String[] args) {
        int[] res = applyOperations(new int[]{1,2,2,1,1,0});
        for(int i : res){
            System.out.print(i + " ");
        }
     }
}
