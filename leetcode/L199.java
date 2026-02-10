import java.util.*;

class Pair{
    TreeNode treeNode;
    int value;

    Pair(TreeNode treeNode, int value){
        this.treeNode = treeNode;
        this.value = value;
    }
}

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

    public static List<Integer> bottomView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                Pair cur = q.poll();
                int idx = cur.value;
                List<Integer> list = map.get(idx);
                if(list == null) list = new ArrayList<>();
                list.add(cur.treeNode.val);
                map.put(idx, list);
                if(cur.treeNode.left != null)q.add(new Pair(cur.treeNode.left, idx-1));
                if(cur.treeNode.right != null)q.add(new Pair(cur.treeNode.right, idx+1));
            }
        }


        for(Map.Entry<Integer, List<Integer>> e: map.entrySet()){
            List<Integer> cur = e.getValue();
            res.add(cur.get(cur.size()-1));
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3, new TreeNode(9), new TreeNode(11));
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.left.left.right = new TreeNode(5, null, new TreeNode(6));
        System.out.println(bottomView(root));
    }
}