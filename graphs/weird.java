import java.util.*;
public class weird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String res="";
        res += n + " ";

        while(n!=1){
            if((n&1) == 0){
                n = n>>1;
            }else{
                n = (n << 1) + n + 1;
            }
            res += n + " ";
        }
        System.out.println(res.trim());
    }
}
