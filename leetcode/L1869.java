public class L1869 {
    public static boolean checkZeroOnes(String s) {
        int zC=0;
        int mzC=0;
        int oC=0;
        int moC=0;

        for(char c : s.toCharArray()){
            int i = c - '0';
            if(i == 0){
                zC++;
                oC=0;
            }else{
                oC++;
                zC=0;
            }
            mzC = Math.max(mzC, zC);
            moC = Math.max(moC, oC);
        }
        return moC > mzC;
    }
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
    }
}
