public class L540 {
    public static int singleNonDuplicate(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        if(nums.length == 1) return nums[0];
        while(lo <= hi){
            int mid = (lo+hi)>>1;
            if(mid == 0 && nums[mid] != nums[mid+1]) return nums[mid];
            else if(mid == nums.length-1 && nums[mid - 1] != nums[mid]) return nums[mid];
            else if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) return nums[mid];

            if(nums[mid-1] == nums[mid]){
                mid = mid-1;
            }
            if((mid & 1) == 0){
                lo = mid+2;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
