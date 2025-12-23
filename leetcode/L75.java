import java.util.Arrays;
public class L75 {
    public static void sortColors(int[] nums) {
        int lo=0;
        int mid=0;
        int hi=nums.length-1;
        
        while(mid <= hi){
            switch(nums[mid]){
                case 0:
                    swap(nums, lo++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, hi--);
                    break;
            }
        }
    }

    public static void swap(int[] ar , int i , int j){
        if(i==j)return;
        ar[i] = ar[i]^ar[j];
        ar[j] = ar[i]^ar[j];
        ar[i] = ar[i]^ar[j];
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}