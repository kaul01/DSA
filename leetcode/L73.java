import java.util.Arrays;
public class L73 {
    public static void setZeroes(int[][] matrix) {
        int col1=1;
        for(int i=0 ; i<matrix.length ; i++){
            if(matrix[i][0] == 0) col1=0;

            for(int j=1 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=matrix.length - 1 ; i>=0 ; i--){
            for(int j=matrix[0].length - 1 ; j>0 ; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
            if(col1 == 0) matrix[i][0] = 0;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
