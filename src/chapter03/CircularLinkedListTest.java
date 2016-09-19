package chapter03;

/**
 * Created by HeeChul on 2016. 9. 19..
 */
public class CircularLinkedListTest {
    public static void main(String[] args) {
        ListNode head = null;
        ListNode<Integer> numberNode1 = new ListNode<>(1);
        ListNode<Integer> numberNode2 = new ListNode<>(2);
        ListNode<Integer> numberNode3 = new ListNode<>(3);
        ListNode<Integer> numberNode4 = new ListNode<>(4);
        ListNode<Integer> numberNode5 = new ListNode<>(5);

        CircularLinkedList.deleteFrontNodeFromCLL(head);
        CircularLinkedList.deleteLastNodeFromCLL(head);

        System.out.println("====================== Insert End ======================");

        head = CircularLinkedList.insertAtEndInCLL(head, numberNode1);
        head = CircularLinkedList.insertAtEndInCLL(head, numberNode2);
        head = CircularLinkedList.insertAtEndInCLL(head, numberNode3);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        System.out.println("====================== Insert Begin ======================");

        head = CircularLinkedList.insertAtBeginInCLL(head, numberNode4);
        head = CircularLinkedList.insertAtBeginInCLL(head, numberNode5);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        System.out.println("====================== Delete Last Node ======================");

        CircularLinkedList.deleteLastNodeFromCLL(head);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        System.out.println("====================== Delete Front Node ======================");

        head = CircularLinkedList.deleteFrontNodeFromCLL(head);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        System.out.println("====================== Test ======================");

        head = CircularLinkedList.deleteLastNodeFromCLL(head);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        head = CircularLinkedList.deleteLastNodeFromCLL(head);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        System.out.println("====================== Delete Last Node ======================");

        head = CircularLinkedList.deleteFrontNodeFromCLL(head);
//        head = CircularLinkedList.deleteLastNodeFromCLL(head);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);

        System.out.println("====================== Null Node ======================");

        head = CircularLinkedList.deleteLastNodeFromCLL(head);
        head = CircularLinkedList.deleteLastNodeFromCLL(head);
        head = CircularLinkedList.deleteLastNodeFromCLL(head);
        head = CircularLinkedList.deleteLastNodeFromCLL(head);
        head = CircularLinkedList.deleteFrontNodeFromCLL(head);
        head = CircularLinkedList.deleteLastNodeFromCLL(head);
        head = CircularLinkedList.deleteFrontNodeFromCLL(head);

        System.out.println("List length = " + CircularLinkedList.getCircularListLength(head));
        CircularLinkedList.printCirculaListData(head);
    }
}
