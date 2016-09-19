package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public class ListNode<T> {
    private T data;
    private ListNode next;

    ListNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
