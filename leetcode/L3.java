import java.util.*;
public class L3 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        Set<Character> set = new HashSet<>();
        int j=0;
        int max=0;
        for(int i=0 ; i<s.length() ; i++){
            if(set.isEmpty()){
                set.add(s.charAt(i));
            }else{
                if(set.contains(s.charAt(i))){
                    while(set.contains(s.charAt(i))){
                        set.remove(s.charAt(j));
                        j++;
                    }
                    set.add(s.charAt(i));
                }else{
                    set.add(s.charAt(i));
                }
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
