public class L1784 {
    public static boolean checkOnesSegment(String s) {
        int flag=1;
        for(char c : s.toCharArray()){
            int i = c - '0';
            if(flag == 1){
                if(i == 0) flag = 0;
            }else{
                if(i == 1) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkOnesSegment("110001"));
    }
}
