public class L74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length - 1;

        while(i < matrix.length && j >= 0){
            int curNum = matrix[i][j];
            if(curNum == target) return true;
            else if(curNum > target) j--;
            else i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}
