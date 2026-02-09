import java.util.*;
public class L199 {
    public static List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                TreeNode cur = q.poll();
                if(i == size - 1){
                    list.add(cur.val);
                }
                if(cur.left != null) q.offer(cur.left);
                if(cur.right != null) q.offer(cur.right);
            }
        }

        return list;
        
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        System.out.println(rightSideView(root));
    }
}
