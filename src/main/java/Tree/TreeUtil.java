package Tree;
import java.util.Scanner;

public class TreeUtil {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node1 root = createTree();
        System.out.println("In order Traversal");
        inOrder(root);
        System.out.println();
        System.out.println("Pre order Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("Post order Traversal");
        postOrder(root);
    }
    public static Node1 createTree() {

        Node1 root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node1(data);
        System.out.println("Enter left for "+ data);
        root.left = createTree();
        System.out.println("Enter right for "+ data);
        root.right = createTree();
        return root;
    }

    /**
     * Binary tree inorder traversal
     * Rule: LNR(Left-->Node-->Right)
     */
    public static void inOrder(Node1 root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static void preOrder(Node1 root){
        if(root == null) return;
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node1 root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

}

 class Node1 {
     public Node1 left, right;
    int data;
    public Node1(int data){
        this.data = data;
    }
}

