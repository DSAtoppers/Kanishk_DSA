package Year2022.Feb;

// This class contains all the operations that we can perform using the Binary search tree

    /*
    The operations are:-
    1. Adding a node
    2. Traversal of tree
    3. Deleting a node
     */

// So firstly we create a Node class. This class will have:-

/*
Node contains:-
-> Data
-> Pointer to left Node
-> Pointer to right node

Now we can create different types of constructors for this node class
One constructor can be a basic one, second can set the left and right values
 */

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}


/*
After creating the Node, we can just create a tree by creating a basic
root node and then adding all the data on the right or the left of the node
 */

class AddingOfNode{
    public static void main(String[] args) {
        Node root = new Node(10);

        /*
        So the tree we are making above will be like
            10
           /  \
        null   null

         */

        root.left = new Node(20);
        root.right = new Node(30);

        /*
            So the tree we are making above will be like
                10
               /  \
            20        30
           /  \      /  \
         null null  null   null

         and the tree will be like this
        */

    }
}

class TraversalOfTrees{

    /*
    So this topic is most important in terms of trees.
    Because in other data structures there are only few ways to traverse them, but in Binary tree, there are many ways to traverse a Binary tree
    Some of the most famous ways of traversals of Binary tree are:
    1. Inorder Traversal
    2. Postorder traversal
    3. Preorder Traversal

    Each one of them is having different approach.
    So let's take example one by one

    ----------INORDER TRAVERSAL------------
    Algorithm Inorder(tree)
   1. Traverse the left subtree, i.e., call Inorder(left-subtree)
   2. Visit the root.
   3. Traverse the right subtree, i.e., call Inorder(right-subtree)
   (The use case we will discuss when it will come in practice)

    ----------POSTORDER TRAVERSAL------------
           Algorithm Postorder(tree)
       1. Traverse the left subtree, i.e., call Postorder(left-subtree)
       2. Traverse the right subtree, i.e., call Postorder(right-subtree)
       3. Visit the root.

    ----------PREORDER TRAVERSAL------------
    Algorithm Preorder(tree)
   1. Visit the root.
   2. Traverse the left subtree, i.e., call Preorder(left-subtree)
   3. Traverse the right subtree, i.e., call Preorder(right-subtree)

   ----------LEVEL ORDER TRAVERSAL------------
   1. Print the tree level by level and then move to next level
   So there are 2 ways to do it, one is just using a function, but the problem with that is
   the time complexity (  O(n^2)  )

   Other than that, the second method is to use the queue. We have used that approach
   Time complexity = O(n)

   So let's code them one by one
     */

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Inorder: ");
        printInorder(root);
        System.out.println();
        System.out.println("Postorder: ");
        printPostorder(root);
        System.out.println();
        System.out.println("Preorder: ");
        printPreOrder(root);
        System.out.println();
        System.out.println("Level Order: ");
        printLevelOrder(root);
    }

    private static void printInorder(Node node){
        if (node == null){
            return;
        }

        printInorder(node.left);

        System.out.print(node.data + " ");

        printInorder(node.right);
    }

    private static void printPostorder(Node node){
        if(node == null){
            return;
        }

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.data + " ");

    }

    private static void printPreOrder(Node node){
        if (node == null){
            return;
        }

        System.out.print(node.data + " ");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }

    private static void printLevelOrder(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);

        while (!queue.isEmpty()){
            Node tempNode = queue.poll(); // This actually removes the head and changes to next head
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null){
                queue.add(tempNode.left);
            }

            if (tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }

}

class DeletingOfNodes{
    /*
    Now we have seen adding and traversing. Now we have to delete the Node

    For that we have 2 cases
    The node can be in somewhere middle, or at the leaves

    Case 1:
    If the node is at the bottom, then we just have to remove it by making the parent node pointer null

    Case 2:
    If we have some node in the middle, then we can go to the rightmost node of the tree, delete that, and then replace
    it with node that we have to delete. We will see how to do that

    The deletion part of binary tree is not that hard because we can just directly take any leaf node and then replace
    it with the target.
     */

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.left.right = new Node(5);
    }

}

public class BinaryTreesIntroduction {

    public static void main(String[] args) {
        Node root = new Node(10);

        /*
        So the tree we are making above will be like
            10
           /  \
        null   null

         */

        root.left = new Node(20);
        root.right = new Node(30);

        /*
            So the tree we are making above will be like
                10
               /  \
            20        30
           /  \      /  \
         null null  null   null

         and the tree will be like this
        */

    }
}
