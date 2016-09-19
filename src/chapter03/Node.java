package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public interface Node<T> {
    void setData(T data);
    T getData();
    void setNext(Node node);
    Node getNext();
}
