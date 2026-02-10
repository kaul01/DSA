public class L110 {
    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    public static int height(TreeNode root){
        if(root == null)return 0;
        int left = height(root.left);
        int right = height(root.right);
        int diff = Math.abs(left - right);
        if(diff > 1 || left == -1 || right == -1) return -1;

        return 1 + Math.max(left, right);

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(9));
        System.out.println(isBalanced(root));
    }
}
