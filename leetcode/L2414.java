public class L2414 {
    public static int longestContinuousSubstring(String s) {
        int ct=1;
        int max=1;
        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i) - s.charAt(i-1) == 1) ct++;
            else ct=1;

            max = Math.max(max, ct);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abacaba"));
    }
}
