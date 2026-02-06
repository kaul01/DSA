public class L485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;

        for(int i : nums){
            if(i == 1) count++;
            else count = 0;

            max = Math.max(max, count);
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
