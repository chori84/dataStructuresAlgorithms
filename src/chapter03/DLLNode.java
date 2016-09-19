package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public class DLLNode<T> {
    private T data;
    private DLLNode next;
    private DLLNode previous;

    DLLNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DLLNode getNext() {
        return next;
    }

    public void setNext(DLLNode next) {
        this.next = next;
    }

    public DLLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLLNode previous) {
        this.previous = previous;
    }
}
