import java.util.*;
public class L599 {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0 ; i<list1.length ; i++){
            if(!map.containsKey(list1[i])){
                map.put(list1[i], i);
            }
        }
        int min = Integer.MAX_VALUE;
        List<String> res = new ArrayList<>();

        for(int i=0 ; i<list2.length ; i++){
            if(map.containsKey(list2[i])){
                int ct = map.get(list2[i]) + i;
                if(ct == min){
                    res.add(list2[i]);
                }if(ct < min){
                    min = ct;
                    res.clear();
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] result = findRestaurant(list1, list2);
        System.out.println("Restaurants: " + Arrays.toString(result));
    }
}
