package trees;

import org.junit.Before;
import org.junit.Test;
import trees.common.Node;

public class LCAOfBinaryTreeTest {
    private Node root;

    @Before
    public void init(){
        root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));

        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));
        root.getLeft().getLeft().setLeft(new Node(6));
        root.getLeft().getRight().setLeft(new Node(7));

        root.getRight().setRight(new Node(8));
        root.getRight().getRight().setLeft(new Node(9));
    }

    @Test
    public void test(){
        BST bst = new BST();

        Node lcaOfBinaryTree = bst.findLCAOfBinaryTree(root, 6, 7);
        System.out.println(lcaOfBinaryTree);

        lcaOfBinaryTree = bst.findLCAOfBinaryTree(root, 2, 3);
        System.out.println(lcaOfBinaryTree);

        lcaOfBinaryTree = bst.findLCAOfBinaryTree(root, 7, 9);
        System.out.println(lcaOfBinaryTree);

        lcaOfBinaryTree = bst.findLCAOfBinaryTree(root, 8, 9);
        System.out.println(lcaOfBinaryTree);
    }
}
