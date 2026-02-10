import java.util.*;
public class L103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag = true;
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)return res;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> row = new ArrayList<>();
            for(int i=0 ; i<size ; i++){
                TreeNode tmp = queue.remove();
                if(flag){
                    row.add(tmp.val);
                }else{
                    row.add(0,tmp.val);
                }
                if(tmp.left!=null)queue.add(tmp.left);
                if(tmp.right!=null)queue.add(tmp.right);
            }
            flag = !flag;
            res.add(row);
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(9));

        System.out.println(zigzagLevelOrder(root));
    }
}
