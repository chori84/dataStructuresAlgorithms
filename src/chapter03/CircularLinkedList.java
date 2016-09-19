package chapter03;

/**
 * Created by HeeChul on 2016. 9. 12..
 */
public class CircularLinkedList {
    public static int getCircularListLength(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;

        while(currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
            if(currentNode == headNode) {
                break;
            }
        }

        return length;
    }

    public static ListNode insertAtEndInCLL(ListNode headNode, ListNode nodeToInsert) {
        ListNode currentNode = headNode;

        while(currentNode != null && currentNode.getNext() != headNode) {
            currentNode = currentNode.getNext();
        }

        nodeToInsert.setNext(nodeToInsert);
        if(headNode == null) {
            headNode = nodeToInsert;
            headNode.setNext(nodeToInsert);
        } else {
            nodeToInsert.setNext(headNode);
            currentNode.setNext(nodeToInsert);
        }

        return headNode;
    }

    public static ListNode insertAtBeginInCLL(ListNode headNode, ListNode nodeToInsert) {
        ListNode currentNode = headNode;

        while(currentNode != null && currentNode.getNext() != headNode) {
            currentNode = currentNode.getNext();
        }

        nodeToInsert.setNext(nodeToInsert);
        if(headNode == null) {
            headNode = nodeToInsert;
            headNode.setNext(nodeToInsert);
        } else {
            nodeToInsert.setNext(headNode);
            currentNode.setNext(nodeToInsert);
            headNode = nodeToInsert;
        }

        return headNode;
    }

    public static ListNode deleteLastNodeFromCLL(ListNode headNode) {
        ListNode temp = headNode;
        ListNode currentNode = headNode;

        if(headNode == null) {
            System.out.println("List Empty");
            return headNode;
        }

        while(currentNode.getNext() != headNode) {
            temp = currentNode;
            currentNode = currentNode.getNext();
        }

        if(currentNode == temp) {
            return null;
        } else {
            temp.setNext(headNode);
            currentNode = null;

            return headNode;
        }
    }

    public static ListNode deleteFrontNodeFromCLL(ListNode headNode) {
        ListNode temp = headNode;
        ListNode currentNode = headNode;

        if(headNode == null) {
            System.out.println("List Empty");
            return headNode;
        }

        while(currentNode.getNext() != headNode) {
            currentNode = currentNode.getNext();
        }

        if(currentNode == temp) {
            return null;
        } else {
            currentNode.setNext(headNode.getNext());
            headNode = headNode.getNext();
            temp = null;

            return headNode;
        }
    }

    public static void printCirculaListData(ListNode headNode) {
        ListNode printNode = headNode;

        while(printNode != null) {
            System.out.println(printNode.getData());
            printNode = printNode.getNext();
            if(printNode == headNode) {
                break;
            }
        }

        if(printNode == null) {
            System.out.println("(null)headNode");
        } else {
            System.out.println("(" + printNode.getData() + ")headNode");
        }
    }
}
