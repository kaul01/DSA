public class L543 {
    static int max=0;
    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left+right);

        return Math.max(left, right) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(9));
        System.out.println(diameterOfBinaryTree(root));
    }
}
