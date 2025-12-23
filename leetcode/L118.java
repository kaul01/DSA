import java.util.ArrayList;
import java.util.List;
public class L118 {
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> row = new ArrayList<>();
        List<List<Integer>> tri = new ArrayList<>();
        row.add(1);
        tri.add(row);
        for(int i=2 ; i<=numRows ; i++){
            List<Integer> prev_row = tri.get(i-2);
            row = new ArrayList<>();
            for(int j=0 ; j < i ; j++){
                if(j == 0 || j == i-1){
                    row.add(1);
                }else{
                    row.add(prev_row.get(j-1) + prev_row.get(j));
                }
            }
            tri.add(row);
        }
        return tri;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}
