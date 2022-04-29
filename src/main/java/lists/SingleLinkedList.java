package lists;

import lists.common.SingleListNode;

import java.util.Objects;

/**
 * Created by ashishm on 25/3/18.
 */
public class SingleLinkedList {
    private SingleListNode head;

    public SingleListNode insertAtBegin(int data) {
        SingleListNode node = new SingleListNode(data);
        if (isNotEmpty()) {
            node.setNext(head);
        }

        head = node;
        return node;
    }

    public SingleListNode insertAtLast(int data) {
        SingleListNode node = new SingleListNode(data);
        final SingleListNode lastNode = getLastNode();
        if (lastNode == null) {
            head = node;
        } else {
            lastNode.setNext(node);
        }

        return node;
    }

    public void insertAtPosition(int position, int data) {
        if (getCountOfNodes() < position) {
            throw new IllegalArgumentException("poistion specified is OUT OF BOUND.");
        }

        if (isNotEmpty()) {
            int count = 0;
            SingleListNode node = new SingleListNode(data);
            SingleListNode prev = head, curr = head;

            while (curr.getNext() != null && count < position - 1) {
                count++;
                prev = curr;
                curr = curr.getNext();
            }

            node.setNext(prev.getNext());
            prev.setNext(node);
        } else {
            insertAtBegin(data);
        }

    }

    public void deleteAtBegin() {
        if (isNotEmpty()) {
            final SingleListNode next = head.getNext();
            head.setNext(null);
            head = next;
        }
    }

    public void deleteAtLast() {
        if (isNotEmpty()) {
            SingleListNode prev = head, curr = head;

            if (curr.getNext() == null) {
                head = null;

            } else {
                while (curr.getNext() != null) {
                    prev = curr;
                    curr = curr.getNext();
                }

                prev.setNext(null);
            }
        }
    }

    public void deleteAtPosition(int position) {
        if (getCountOfNodes() < position) {
            throw new IllegalArgumentException("poistion specified is OUT OF BOUND.");
        }

        if (position == 1) {
            deleteAtBegin();
        } else {
            SingleListNode prev = head, curr = head;

            for (int i = 1; i < position && curr.getNext() != null; i++) {
                prev = curr;
                curr = curr.getNext();
            }

            prev.setNext(curr.getNext());
            curr.setNext(null);
        }
    }

    public SingleListNode getLastNode() {
        SingleListNode curr = head;
        while (curr != null && curr.getNext() != null) {
            curr = curr.getNext();
        }
        return curr;
    }

    public boolean isDataExists(SingleListNode head, int key) {
        if (head == null) {
            return false;
        } else if (head.getData() == key) {
            return true;
        } else {
            return isDataExists(head.getNext(), key);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isNotEmpty() {
        return !isEmpty();
    }

    public int getCountOfNodes() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        SingleListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }

        return count;
    }

    public void reverse() {
        SingleListNode prev = null;
        SingleListNode curr = head;

        while (curr != null) {
            SingleListNode temp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = temp;
        }

        head = prev;
    }

    public void recursiveReverse(SingleListNode prev, SingleListNode curr) {
        if (curr == null) {
            head = prev;
            return;
        }

        SingleListNode temp = curr.getNext();
        curr.setNext(prev);
        prev = curr;
        curr = temp;
        recursiveReverse(prev, curr);
    }

    public SingleListNode merge(SingleListNode list1, SingleListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        SingleListNode head;
        if (list1.getData() < list2.getData()) {
            head = list1;
        } else {
            head = list2;
            list2 = list1;
            list1 = head;
        }

        while (list1.getNext() != null) {
            if (list1.getNext().getData() > list2.getData()) {
                SingleListNode temp = list1.getNext();
                list1.setNext(list2);
                list2 = temp;
            }

            list1 = list1.getNext();
        }

        list1.setNext(list2);
        return head;
    }

    public SingleListNode mergeSort(SingleListNode head) {
        if (head != null && head.getNext() == null) {
            return head;
        }

        final SingleListNode middle = getMiddle(head);
        SingleListNode temp = middle.getNext();
        middle.setNext(null);

        final SingleListNode list1 = mergeSort(head);
        final SingleListNode list2 = mergeSort(temp);
        return merge(list1, list2);
    }

    public SingleListNode getMiddle(SingleListNode head) {
        if (isNotEmpty()) {
            SingleListNode slwPtr = head;
            SingleListNode fastPtr = head;

            while (slwPtr != null && slwPtr.getNext() != null && fastPtr.getNext() != null && fastPtr.getNext().getNext() != null) {
                slwPtr = slwPtr.getNext();
                fastPtr = fastPtr.getNext().getNext();
            }

            return slwPtr;
        }

        return null;
    }

    //TODO
    public boolean checkPalindrome(SingleListNode head) {
        return false;
    }

    public void removeDuplicatesFromSortedList(SingleListNode node) {
        while (node != null && node.getNext() != null) {
            if (node.getData() == node.getNext().getData()) {
                SingleListNode next = node.getNext();
                node.setNext(next.getNext());
                next.setNext(null);
            } else {
                node = node.getNext();
            }
        }
    }

    public SingleListNode reverseByBlocks(SingleListNode head, int k) {
        SingleListNode prev, curr;
        prev = null;
        curr = head;
        int count = 0;

        while (curr != null && count < k) {
            final SingleListNode next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
            count++;
        }

        if (curr != null) {
            head.setNext(reverseByBlocks(curr, k));
        }

        return prev;
    }

    public SingleListNode intersectionOfTwoSortedLists(SingleListNode list1, SingleListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.getData() == list2.getData()) {
                insertAtLast(list1.getData());
                list1 = list1.getNext();
                list2 = list2.getNext();
            } else if (list1.getData() < list2.getData()) {
                list1 = list1.getNext();
            } else {
                list2 = list2.getNext();
            }
        }
        return head;
    }

    //TODO
    public SingleListNode unionOfTwoSortedLists(SingleListNode list1, SingleListNode list2) {
        return null;
    }

    //TODO
    public void rotateAntiClockwiseByKPositions(SingleListNode head, int k) {

    }

    //TODO
    public void skipMDeleteNNodes(SingleListNode head, int M, int N) {
    }

    public boolean isLoopExists(SingleListNode head) {
        if (head == null) {
            return false;
        }

        SingleListNode slwPtr = head;
        SingleListNode fastPtr = head.getNext();

        while (fastPtr.getNext() != null) {
            slwPtr = slwPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();

            if (slwPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }

    public int getLengthOfTheLoop(SingleListNode head) {
        if (head == null) {
            return -1;
        }

        SingleListNode slwPtr = head;
        SingleListNode fastPtr = head.getNext();
        boolean isLoopExists = false;
        while (fastPtr.getNext() != null) {
            slwPtr = slwPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();

            if (slwPtr == fastPtr) {
                isLoopExists = true;
                break;
            }
        }

        if (isLoopExists) {
            int count = 0;
            do {
                count++;
                slwPtr = slwPtr.getNext();
            } while (slwPtr != fastPtr);

            return count;
        }

        return -1;
    }

    public SingleListNode getStartNodeOfTheLoop() {
        if (head == null) {
            return null;
        }

        SingleListNode slwPtr = head;
        SingleListNode fastPtr = head.getNext();
        boolean isLoopExists = false;
        while (fastPtr.getNext() != null) {
            slwPtr = slwPtr.getNext();
            fastPtr = fastPtr.getNext().getNext();

            if (slwPtr == fastPtr) {
                isLoopExists = true;
                break;
            }
        }

        if (isLoopExists) {
            int count = 0;
            do {
                count++;
                slwPtr = slwPtr.getNext();
            } while (slwPtr != fastPtr);


            if (count == 1) {
                return slwPtr;
            } else {
                fastPtr = head;
                slwPtr = head;
                while (count > 0) {
                    fastPtr = fastPtr.getNext();
                }
            }

        }

        return null;
    }

    public SingleListNode reverseAlternateKNodes(SingleListNode node, int k, boolean reverse) {
        if (reverse) {
            SingleListNode prev, curr;
            prev = null;
            curr = node;
            int count = 0;

            while (curr != null && count < k) {
                final SingleListNode next = curr.getNext();
                curr.setNext(prev);
                prev = curr;
                curr = next;
                count++;
            }

            if (curr != null) {
                node.setNext(reverseAlternateKNodes(curr, k, !reverse));
            }

            return prev;
        } else {
            int i = 0;
            SingleListNode temp = node;
            while (i < k && temp != null) {
                temp = temp.getNext();
                i++;
            }

            if (temp != null) {
                temp.setNext(reverseAlternateKNodes(temp.getNext(), k, !reverse));
            }

            return node;
        }
    }

    public SingleListNode mergeTwoListsAtAlternatePosition(SingleListNode node1,
                                                           SingleListNode node2) {
        SingleListNode head = node1;
        while (Objects.nonNull(node1) && Objects.nonNull(node2)) {
            SingleListNode node1Next = node1.getNext();
            SingleListNode node2Next = node2.getNext();

            node1.setNext(node2);
            if (Objects.nonNull(node1Next)) {
                node2.setNext(node1Next);
            }

            node1 = node1Next;
            node2 = node2Next;
        }

        return head;
    }

    public SingleListNode reOrderList(SingleListNode head) {
        //Get middle.
        SingleListNode middle = getMiddle(head);
        //Second part of the list.
        SingleListNode node2 = middle.getNext();
        //Reverse second part of list.
        SingleListNode prev = null;
        SingleListNode curr = node2;
        while (curr != null) {
            SingleListNode temp = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = temp;
        }
        //Split the list.
        node2 = prev;
        middle.setNext(null);
        //Merge list at alterate pos.
        mergeTwoListsAtAlternatePosition(head, node2);
        return head;
    }

    @Override
    public String toString() {
        if (isNotEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            SingleListNode curr = head;
            while (curr != null) {
                stringBuffer.append(curr).append(" -> ");
                curr = curr.getNext();
            }
            stringBuffer.append("NULL");
            return stringBuffer.toString();
        }

        return "";
    }
}
