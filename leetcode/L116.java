import java.util.*;
class Node {
    Node left;
    Node right;
    Node next;
    int val;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}


public class L116 {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root == null)return null;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size ; i++){
                Node tmp = q.remove();
                if(tmp.left!=null)q.add(tmp.left);
                if(tmp.right!=null)q.add(tmp.right);
                if(i == size-1){
                    tmp.next = null;
                }else{
                    tmp.next = q.peek();
                }
            }
        }
        return root;
    }
}
