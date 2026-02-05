import java.util.*;
public class L2405 {
    public static int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int res=1;
        for(char c : s.toCharArray()){
            if(set.isEmpty()){
                set.add(c);
            }else{
                if(set.contains(c)){
                    set.clear();
                    res++;
                }
                set.add(c);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }
}
