package trees;

import org.junit.Before;
import org.junit.Test;
import trees.common.Node;

public class DeepestNodeTest {

    private BST bst;

    @Before
    public void initBST() {
        bst = new BST();
        /* Let us create following BST
              5
           /    \
          4      8
                  \
                  10 */
        bst.insertIterative(5);
        bst.insertIterative(4);
        bst.insertIterative(3);
        bst.insertIterative(2);
        bst.insertIterative(1);
        bst.insertIterative(8);
        bst.insertIterative(10);
    }

    @Test
    public void testDeepestNode(){
        DeepestNode deepestNode = new DeepestNode();
        final Node node = deepestNode.getDeepestNode(bst.getRoot());
        System.out.println(node);
    }

    @Test
    public void testDeepestLeftNode(){
        DeepestNode deepestNode = new DeepestNode();
        final Node node = deepestNode.getDeepestLeftNode(bst.getRoot(), false);
        System.out.println(node);
    }
}
