public class L2110 {
    public static long getDescentPeriods(int[] prices) {
        long ct=0l;
        long cur=1l;
        for(int i=1 ; i<prices.length ; i++){
            if(prices[i-1] - prices[i] == 1){
                cur++;
            }else{
                ct = ct + (cur*(cur+1)/2);
                cur = 1;
            }
        }
        ct = ct + (cur*(cur+1)/2);
        return ct;
    }
    public static void main(String[] args) {
        System.out.println(getDescentPeriods(new int[]{3,2,1,4}));
    }
}
