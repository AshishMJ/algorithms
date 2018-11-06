package lists.common;

/**
 * Created by ashishm on 25/3/18.
 */
public class SingleListNode {
    private int data;
    private SingleListNode next;

    public SingleListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleListNode getNext() {
        return next;
    }

    public void setNext(SingleListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
