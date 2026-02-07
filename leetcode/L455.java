import java.util.*;
public class L455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ct=0;
        int i=0;
        int j=0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]) {
                ct++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return ct;
    }
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }
}
