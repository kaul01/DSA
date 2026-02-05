public class L1695 {
    public static int maximumUniqueSubarray(int[] nums) {
        boolean[] set = new boolean[10001];
        int max=0;
        int cur = 0;
        int j=0;
        for(int i : nums){
            while(set[i]){
                set[nums[j]] = false;
                cur -= nums[j];
                j++;
            }
            set[i] = true;
            cur += i;
            max = Math.max(cur, max);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }
}
