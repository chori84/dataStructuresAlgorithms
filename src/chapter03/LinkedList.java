package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public class LinkedList {
    public static int listLength(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;

        while(currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }

        return length;
    }

    public static ListNode insertInLinedList(ListNode headNode, ListNode nodeToInsert, int position) {
        if(headNode == null) {
            return nodeToInsert;
        }

        int size = listLength(headNode);

        if(position > size + 1 || position < 1) {
            System.out.println("Position of node to insert is invalid. The valid inputs are 1 to " + (size + 1));

            return headNode;
        }

        if(position == 1) {
            nodeToInsert.setNext(headNode);
            headNode = nodeToInsert;
        } else {
            ListNode previousNode = headNode;
            int count = 1;

            while(count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }

            ListNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            previousNode.setNext(nodeToInsert);
        }

        return headNode;
    }

    public static ListNode deleteNodeFromLinkedList(ListNode headNode, int position) {
        int size = listLength(headNode);

        if(position > size || position < 1) {
            System.out.println("Position of node to delete is invalid. The valid inputs are 1 to " + size);

            return headNode;
        } else {
            ListNode previousNode = headNode;
            int count = 1;

            while(count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }

            ListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode = null;
        }

        return headNode;
    }

    public void deleteLinkedList(ListNode head) {
        ListNode auxilaryNode, iterator = head;

        while(iterator != null) {
            auxilaryNode = iterator.getNext();
            iterator = null;
            iterator = auxilaryNode;
        }
    }

    public static void printList(ListNode printNode) {
        while(printNode != null) {
            System.out.println(printNode.getData());
            printNode = printNode.getNext();
        }
    }
}
