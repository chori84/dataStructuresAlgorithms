package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DLLNode head = null;
        DLLNode<String> stringNode1 = new DLLNode<>("1");
        DLLNode<String> stringNode2 = new DLLNode<>("2");
        DLLNode<String> stringNode3 = new DLLNode<>("3");
        DLLNode<String> stringNode4 = new DLLNode<>("4");
        DLLNode<String> stringNode5 = new DLLNode<>("5");

        head = DoubleLinkedList.insertDLLNode(head, stringNode1, 1);
        head = DoubleLinkedList.insertDLLNode(head, stringNode2, 2);
        head = DoubleLinkedList.insertDLLNode(head, stringNode3, 3);
        head = DoubleLinkedList.insertDLLNode(head, stringNode4, 4);
        head = DoubleLinkedList.insertDLLNode(head, stringNode5, 5);

        DoubleLinkedList.printList(head);

        System.out.println("=======================================");
        head = DoubleLinkedList.insertDLLNode(head, new DLLNode("10"), 3);
        DoubleLinkedList.printList(head);

        System.out.println("=======================================");
        head = DoubleLinkedList.deleteDLLNode(head, 2);
        DoubleLinkedList.printList(head);
    }
}
