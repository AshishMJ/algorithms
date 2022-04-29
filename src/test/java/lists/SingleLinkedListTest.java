package lists;

import lists.common.SingleListNode;
import org.junit.Test;

/**
 * Created by ashishm on 25/3/18.
 */
public class SingleLinkedListTest {

    @Test
    public void insertTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int i = 1; i < 5; i++) {
            singleLinkedList.insertAtLast(i);
        }

        for (int i = 1; i < 5; i++) {
            singleLinkedList.insertAtBegin(i);
        }

        System.out.println(singleLinkedList.isEmpty());
        System.out.println(singleLinkedList.getCountOfNodes());
        System.out.println(singleLinkedList.getLastNode());
        System.out.println(singleLinkedList);
    }

    @Test
    public void deleteTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int i = 1; i <= 1; i++) {
            singleLinkedList.insertAtLast(i);
        }

        for (int i = 1; i < 2; i++) {
            singleLinkedList.deleteAtLast();
        }

        System.out.println(singleLinkedList.isEmpty());
        System.out.println(singleLinkedList.getCountOfNodes());
        System.out.println(singleLinkedList.getLastNode());
        System.out.println(singleLinkedList);
    }

    @Test
    public void insertAtPositionTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int i = 1; i <= 5; i++) {
            singleLinkedList.insertAtBegin(i);
        }
        System.out.println(singleLinkedList);

        singleLinkedList.insertAtPosition(5, 2);

        System.out.println(singleLinkedList);
    }

    @Test
    public void deleteAtPositionTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for (int i = 1; i <= 5; i++) {
            singleLinkedList.insertAtBegin(i);
        }
        System.out.println(singleLinkedList);

        singleLinkedList.deleteAtPosition(5);

        System.out.println(singleLinkedList);
    }

    @Test
    public void isExistsTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        final SingleListNode headNode = singleLinkedList.insertAtLast(1);

        for (int i = 2; i <= 5; i++) {
            singleLinkedList.insertAtLast(i);
        }

        System.out.println(singleLinkedList.isDataExists(headNode, 10));
    }

    @Test
    public void reverse() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        final SingleListNode headNode = singleLinkedList.insertAtLast(1);

        for (int i = 2; i <= 5; i++) {
            singleLinkedList.insertAtLast(i);
        }

        System.out.println(singleLinkedList);

        singleLinkedList.recursiveReverse(null, headNode);

        System.out.println(singleLinkedList);
    }


    @Test
    public void mergeTwoSortedLists() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        SingleListNode list1 = singleLinkedList.insertAtLast(3);
        singleLinkedList.insertAtLast(6);
        singleLinkedList.insertAtLast(9);

        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        SingleListNode list2 = singleLinkedList2.insertAtLast(4);
        singleLinkedList2.insertAtLast(7);
        singleLinkedList2.insertAtLast(8);


        final SingleListNode node = singleLinkedList.merge(list1, list2);
        SingleListNode temp = node;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Test
    public void findMiddle() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        final SingleListNode headNode = singleLinkedList.insertAtLast(3);
        singleLinkedList.insertAtLast(6);
        singleLinkedList.insertAtLast(9);
        ;
        singleLinkedList.insertAtLast(4);
        singleLinkedList.insertAtLast(7);
        singleLinkedList.insertAtLast(8);


        final SingleListNode middleNode = singleLinkedList.getMiddle(headNode);
        System.out.println(middleNode);
    }

    @Test
    public void mergeSort() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        final SingleListNode headNode = singleLinkedList.insertAtLast(3);
        singleLinkedList.insertAtLast(1);
        singleLinkedList.insertAtLast(3);
        ;
        singleLinkedList.insertAtLast(8);
        singleLinkedList.insertAtLast(6);
        singleLinkedList.insertAtLast(5);


        final SingleListNode headNodeOfSort = singleLinkedList.mergeSort(headNode);
        SingleListNode temp = headNodeOfSort;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Test
    public void removeDuplicatesTest() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        final SingleListNode headNode = singleLinkedList.insertAtLast(11);
        singleLinkedList.insertAtLast(11);
        singleLinkedList.insertAtLast(21);
        ;
        singleLinkedList.insertAtLast(43);
        singleLinkedList.insertAtLast(43);
        singleLinkedList.insertAtLast(60);

        singleLinkedList.removeDuplicatesFromSortedList(headNode);
        SingleListNode temp = headNode;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Test
    public void intersectionOfTwoSortedLists() {
        SingleLinkedList list1 = new SingleLinkedList();
        final SingleListNode headNode1 = list1.insertAtLast(1);
        list1.insertAtLast(2);
        list1.insertAtLast(3);
        ;
        list1.insertAtLast(4);
        list1.insertAtLast(5);
        list1.insertAtLast(6);

        SingleLinkedList list2 = new SingleLinkedList();
        final SingleListNode headNode2 = list2.insertAtLast(2);
        list2.insertAtLast(4);
        list2.insertAtLast(6);
        list2.insertAtLast(8);

        SingleLinkedList list = new SingleLinkedList();
        final SingleListNode headNode = list.intersectionOfTwoSortedLists(headNode1, headNode2);
        SingleListNode temp = headNode;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Test
    public void reverseByKBlocks() {
        SingleLinkedList list = new SingleLinkedList();
        final SingleListNode headNode = list.insertAtLast(1);
        for (int i = 2; i <= 8; i++) {
            list.insertAtLast(i);
        }

        final SingleListNode newHeadNode = list.reverseByBlocks(headNode, 2);
        SingleListNode temp = newHeadNode;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Test
    public void isLoopExistsTest() {
        SingleLinkedList list = new SingleLinkedList();
        /*head -> 1 -> 2 -> 3 -> 4 -> 5
                            ^          |
                            |          V
        |                   8 <- 7 <- 6*/
        final SingleListNode headNode = list.insertAtLast(1);
        list.insertAtLast(2);
        final SingleListNode thirdNode = list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtLast(7);
        final SingleListNode lastNode = list.insertAtLast(8);
        lastNode.setNext(thirdNode);

        System.out.println("isLoopExists : " + list.isLoopExists(headNode));
        System.out.println("lenghtOfTheLoop" + list.getLengthOfTheLoop(headNode));
    }

    @Test
    public void flattenList() {
        FlattenList L = new FlattenList();

        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);

        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);

        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 20);

        // flatten the list
        L.head = L.flattenList(L.head);

        L.printList();
    }

    @Test
    public void mergeTwoListsAtAlternatePosition() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        SingleListNode list1 = singleLinkedList.insertAtLast(3);
        singleLinkedList.insertAtLast(6);
        singleLinkedList.insertAtLast(9);

        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        SingleListNode list2 = singleLinkedList2.insertAtLast(4);
        singleLinkedList2.insertAtLast(7);
        singleLinkedList2.insertAtLast(8);

        final SingleListNode node = singleLinkedList.mergeTwoListsAtAlternatePosition(list1, list2);
        SingleListNode temp = node;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    @Test
    public void reOrderList() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        SingleListNode list = singleLinkedList.insertAtLast(1);
        singleLinkedList.insertAtLast(2);
        singleLinkedList.insertAtLast(3);
        singleLinkedList.insertAtLast(4);
        singleLinkedList.insertAtLast(5);

        final SingleListNode node = singleLinkedList.reOrderList(list);
        SingleListNode temp = node;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
