import java.util.*;;
public class L2260 {
    public static int minimumCardPickup(int[] cards) {
        int min=Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<cards.length ; i++){
            if(map.containsKey(cards[i])){
                int cur = i - map.get(cards[i]) + 1;
                min = Math.min(min, cur);
                map.put(cards[i], i);
            }else{
                map.put(cards[i], i);
            }
        }
        if(min == Integer.MAX_VALUE) min = -1;
        return min;
    }
    public static void main(String[] args) {
        System.out.println(minimumCardPickup(new int[]{3,4,2,3,4,7}));
    }
}
