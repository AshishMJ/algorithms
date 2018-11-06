package lists;

public class FlattenList {

    Node head;  // head of list

    class Node {
        int data;
        Node down;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node flattenList(Node node) {
        if (node.right == null) {
            return null;
        }

        final Node next_next = node.right.right;
        final Node merge = merge(node, node.right);
        merge.right = next_next;
        flattenList(merge);
        return merge;
    }

    private Node merge(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }

        if (node2 == null) {
            return node1;
        }

        while (node1.down != null) {
            if (node1.down.data > node2.data) {
                final Node downPtr = node1.down;
                node1.down = node2;
                node2 = downPtr;
            }
            node1 = node1.down;
        }

        node1.down = node2;
        return node1;
    }

    Node push(Node head_ref, int data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(data);

        /* 3. Make right of new Node as head */
        new_node.down = head_ref;

        /* 4. Move the head to point to new Node */
        head_ref = new_node;

        /*5. return to link it back */
        return head_ref;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }


}
