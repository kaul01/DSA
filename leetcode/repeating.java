
public class repeating {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int sum_square = n*(n+1)*(2*n+1)/6;

        int arr_sum=0;
        int arr_sum_square=0;
        for(int i=0 ; i<n ; i++){
            arr_sum += nums[i];
            arr_sum_square += (nums[i]*nums[i]);
        }
        int diff = arr_sum - sum;
        int sq_diff = arr_sum_square - sum_square;
        int pos_diff = sq_diff / diff;

        int repeatingNumber = (diff + pos_diff)/2;
        int missingNumber = pos_diff - repeatingNumber;

        return new int[]{repeatingNumber, missingNumber};
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 6, 7, 5, 7};
        int[] result = findMissingRepeatingNumbers(nums);
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}