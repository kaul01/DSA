import java.util.*;

public class trees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = createTree(sc);
        System.out.println("Tree created successfully");
        sc.close();

        System.out.println("Inorder traversal: ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        postorder(root);
        System.out.println();
    }

    public static TreeNode createTree(Scanner sc){
        TreeNode root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new TreeNode(data);
        System.out.println("Enter the left child of " + data);
        root.left = createTree(sc);
        System.out.println("Enter the right child of " + data);
        root.right = createTree(sc);
        return root;
    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}