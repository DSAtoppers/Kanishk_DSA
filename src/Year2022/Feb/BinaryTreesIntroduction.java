package Year2022.Feb;

// This class contains all the operations that we can perform using the Binary search tree

    /*
    The operations are:-
    1. Adding a node
    2. Traversal of tree
    3. Deleting a node
    4. Adding a node after a particular data
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
