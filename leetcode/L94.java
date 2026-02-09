import java.util.*;;
public class L94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    public static void inorder(TreeNode root, List<Integer> res){
        if(root  == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    
    public static List<Integer> preorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
    public static void preorder(TreeNode root, List<Integer> res){
        if(root == null)return;
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));
    }
}
