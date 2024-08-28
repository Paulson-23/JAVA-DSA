import java.util.*;

public class BinaryTree{

    class Node
    {
        private int val;
        private Node left;
        private Node right;

        public Node(int val)
        {
            this.val=val;
            left=null;
            right=null;
        }
    }

    private Node root;

    private void populate(Scanner sc)
    {
        System.out.println("Enter head Node:");
        root=new Node(sc.nextInt());
        populate(sc,root);
    } 

    private void populate(Scanner sc, Node node)
    {
        System.out.println("Do you want to add a left child:");
        boolean choice=sc.nextBoolean();
        if(choice)
        {
            System.out.println("Enter left child value of "+node.val+" :");
            node.left=new Node(sc.nextInt());
            populate(sc, node.left);
        }
        System.out.println("Do you want to add a right child:");
        choice=sc.nextBoolean();
        if(choice)
        {
            System.out.println("Enter right child value of "+node.val+" :");
            node.right=new Node(sc.nextInt());
            populate(sc, node.right);
        }
    }

    private void display(Node node)
    {
        if(node==null)
        return;
        display(node.left);
        display(node.right);
        System.out.print(node.val);
        // System.out.print(node.val);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BinaryTree Tree=new BinaryTree();
        Tree.populate(sc);
        Tree.display(Tree.root);
    }
}