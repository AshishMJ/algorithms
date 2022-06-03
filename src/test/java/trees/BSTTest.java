package trees;

import org.junit.Before;
import org.junit.Test;
import trees.common.Node;

/**
 * Created by ashishm on 15/4/18.
 */
public class BSTTest {

    private BST bst;

    @Before
    public void initBST() {
        bst = new BST();
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        bst.insertIterative(50);
        bst.insertIterative(30);
        bst.insertIterative(20);
        bst.insertIterative(70);
        bst.insertIterative(40);
        bst.insertIterative(80);
        bst.insertIterative(60);
    }

    @Test
    public void insertIterativeTest() {
        bst.levelOrderTraverseIterative();
    }

    @Test
    public void searchIterativeTest() {
        Node node = bst.searchForKeyIterative(60);
        System.out.println(node);

        node = bst.searchForKeyIterative(0);
        System.out.println(node);
    }

    @Test
    public void mavValueAndMinValueRecursive() {
        Node node = bst.getMaxValueRecursive(bst.getRoot());
        System.out.println("Maximum value is-" + node);

        node = bst.getMinValueRecursive(bst.getRoot());
        System.out.println("Minimum value is-" + node);
    }

    @Test
    public void checkIfBSTTest() {
        Node maxNode = bst.getMaxValueRecursive(bst.getRoot());
        int MAX = maxNode.getData();

        Node minNode = bst.getMinValueRecursive(bst.getRoot());
        int MIN = minNode.getData();

        System.out.println(bst.isBST(bst.getRoot(), MAX, MIN));
    }

    @Test
    public void convertToSumTree() {
        bst.convertToSumTree(bst.getRoot());
        bst.levelOrderTraverseIterative();
    }

    @Test
    public void getLCAOfTwoNodes(){
        Node lcaOfTwoNodesRecursive = bst.getLCAOfTwoNodesRecursive(bst.getRoot(), 40, 60);
        System.out.println(lcaOfTwoNodesRecursive);

        lcaOfTwoNodesRecursive = bst.getLCAOfTwoNodesRecursive(bst.getRoot(), 40, 20);
        System.out.println(lcaOfTwoNodesRecursive);

        lcaOfTwoNodesRecursive = bst.getLCAOfTwoNodesRecursive(bst.getRoot(), 80, 60);
        System.out.println(lcaOfTwoNodesRecursive);

        lcaOfTwoNodesRecursive = bst.getLCAOfTwoNodesRecursive(bst.getRoot(), 23894732, 98234732);
        System.out.println(lcaOfTwoNodesRecursive);
    }

    @Test
    public void getInOrderSuccessorOfGivenNodeTest(){
        Node inOrderSuccessorOfGivenNode = bst.getInOrderSuccessorOfGivenNode(bst.getRoot(), 70);
        System.out.println(inOrderSuccessorOfGivenNode);

        inOrderSuccessorOfGivenNode = bst.getInOrderSuccessorOfGivenNode(bst.getRoot(), 60);
        System.out.println(inOrderSuccessorOfGivenNode);

        inOrderSuccessorOfGivenNode = bst.getInOrderSuccessorOfGivenNode(bst.getRoot(), 80);
        System.out.println(inOrderSuccessorOfGivenNode);

        inOrderSuccessorOfGivenNode = bst.getInOrderSuccessorOfGivenNode(bst.getRoot(), 40);
        System.out.println(inOrderSuccessorOfGivenNode);
    }

    @Test
    public void testInOrderIterative(){
        bst.inOrderTraverseIterative();
    }

    @Test
    public void testPreOrderIterative(){
        bst.preOrderTraverseIterative();
    }

    @Test
    public void testPreOrderIterativeNew(){
        bst.preOrderTraverseIterativeNew();
    }

    @Test
    public void convertToMirrorTree(){
        bst.convertToMirrorTree();
        bst.levelOrderTraverseIterative();
    }

}
