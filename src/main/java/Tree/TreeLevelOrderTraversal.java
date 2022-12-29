package Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeLevelOrderTraversal {
    public static boolean printLeve(Node root, int level){
        if(root == null){
            return false;
        }
        if(level == 1){
            System.out.print(root.data+" ");
            return true;
        }
        boolean leftLevel = printLeve(root.left, level-1);
        boolean rightLevel = printLeve(root.right, level-1);

        return leftLevel || rightLevel;
    }

    // Time complexity of below approach is o(n^2)
    public static void levelOrderTraversal(Node root){
        int level =1;
        while(printLeve(root, level)){
            level++;
        }
    }

    /**
     * Using Queue we can reduce time complexity to o(n)
     * @param node
     */

    public static  void levelOrderTraversalUsingQueue(Node root){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        Node current = null;
        while (!queue.isEmpty()){
            current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left != null)
                queue.add(current.left);
            if(current.right != null)
                queue.add(current.right);
        }
    }
    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        System.out.println("Using recursion");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("Using Queue");
        levelOrderTraversalUsingQueue(root);
    }
}
