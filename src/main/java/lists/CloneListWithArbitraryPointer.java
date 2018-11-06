package lists;

public class CloneListWithArbitraryPointer {

    class Node {
        int data;
        Node next;
        Node random;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node clone(Node originalHead) {
        if (originalHead == null) {
            return null;
        }

        Node curr = originalHead;

        while (curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            newNode.random = curr.random;

            curr.next = newNode;
            curr = newNode.next;
        }

        curr = originalHead;
        while (curr != null) {
            Node newNode = curr.next;
            Node originalRandom = newNode.random;
            if (originalRandom != null) {
                newNode.random = originalRandom.next;
            }

            curr = curr.next.next;
        }

        curr = originalHead;
        Node dummy = new Node(0);
        Node newCurrent = dummy;
        while (curr != null) {
            newCurrent.next = curr.next;
            newCurrent = newCurrent.next;
            curr.next = curr.next.next;
            curr = curr.next;
        }

        return dummy.next;
    }


}
