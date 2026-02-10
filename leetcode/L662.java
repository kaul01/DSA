import java.util.*;
class TreePair{
    private final TreeNode key;
    private final Integer value;
    TreePair(TreeNode key, Integer value) {
        this.key = key;
        this.value = value;
    }
    public TreeNode getKey() { return key; }
    public Integer getValue() { return value; }
}

public class L662 {
    public static int widthOfBinaryTree(TreeNode root) {
        Queue<TreePair> q = new LinkedList<>();
        if(root == null) return 0;
        int max=0;
        q.offer(new TreePair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int e1 = 0;
            int e2 = 0;
            for(int i=0 ; i<size ; i++){
                TreePair cur = q.poll();
                TreeNode cur_t = cur.getKey();
                int cur_v = cur.getValue();
                if(i == 0){
                    e1 = cur_v;
                }else if(i == size-1){
                    e2 = cur_v;
                }
                if(cur_t.left != null) q.offer(new TreePair(cur_t.left, cur_v*2));
                if(cur_t.right != null) q.offer(new TreePair(cur_t.right, cur_v*2+1));
            }
            if(size == 1){
                e2=0;
                e1=0;
            }
            max = Math.max(max, e2-e1);
        }
        return max+1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3, new TreeNode(5), new TreeNode(3));
        root.right = new TreeNode(2, null, new TreeNode(9));

        System.out.println(widthOfBinaryTree(root));
    }
}
