package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public class LinkedListTest {
    public static void main(String[] args) {
        ListNode head = null;
        ListNode<Integer> numberNode1 = new ListNode<>(1);
        ListNode<Integer> numberNode2 = new ListNode<>(2);
        ListNode<Integer> numberNode3 = new ListNode<>(3);
        ListNode<Integer> numberNode4 = new ListNode<>(4);
        ListNode<Integer> numberNode5 = new ListNode<>(5);

        head = LinkedList.insertInLinedList(head, numberNode1, 1);
        head = LinkedList.insertInLinedList(head, numberNode2, 2);
        head = LinkedList.insertInLinedList(head, numberNode3, 3);
        head = LinkedList.insertInLinedList(head, numberNode4, 4);
        head = LinkedList.insertInLinedList(head, numberNode5, 5);

        head = numberNode1;

        LinkedList.printList(head);

        System.out.println("============================================");

        ListNode<Integer> insertNumberNode = new ListNode<>(10);
        head = LinkedList.insertInLinedList(head, insertNumberNode, 4);

        LinkedList.printList(head);

        System.out.println("============================================");

        head = LinkedList.deleteNodeFromLinkedList(head, 4);
        LinkedList.printList(head);
    }
}
