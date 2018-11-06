package trees;

import org.junit.Before;
import org.junit.Test;
import trees.common.Node;

public class VerticalOrderTest {
    private Node root;

    @Before
    public void init(){
        //Tree
        //           1
        //          /  \
        //         2     3
        //        / \    / \
        //       4   5  6   7
        //               \   \
        //                8   9
        root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));

        root.getLeft().setLeft(new Node(4));
        root.getLeft().setRight(new Node(5));

        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(7));

        root.getRight().getLeft().setRight(new Node(8));
        root.getRight().getRight().setRight(new Node(9));
    }

    @Test
    public void testVerticalOrder(){
        VerticalOrder verticalOrder = new VerticalOrder();
        verticalOrder.print(root, "All");
    }

    @Test
    public void testVerticalOrderBottom(){
        VerticalOrder verticalOrder = new VerticalOrder();
        verticalOrder.print(root, "Bottom");
    }
}
