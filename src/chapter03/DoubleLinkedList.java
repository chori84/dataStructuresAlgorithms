package chapter03;

/**
 * Created by HeeChul on 2016. 9. 11..
 */
public class DoubleLinkedList {
    public static int getDLLLength(DLLNode headNode) {
        int length = 0;
        DLLNode currentNode = headNode;

        while(currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }

        return length;
    }

    public static DLLNode insertDLLNode(DLLNode headNode, DLLNode nodeToInsert, int position) {
        if(headNode == null) {
            return nodeToInsert;
        }

        int size = getDLLLength(headNode);
        if(position > size + 1 || position < 1) {
            System.out.println("Position of nodeToInsert is valid. The valid inputs are 1 to " + (size + 1));

            return headNode;
        }

        if(position == 1) {
            nodeToInsert.setNext(headNode);
            headNode.setPrevious(nodeToInsert);

            return nodeToInsert;
        } else {
            DLLNode previousNode = headNode;
            int count = 1;

            while(count < position-1) {
                previousNode = previousNode.getNext();
                count++;
            }

            DLLNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);

            if(currentNode != null) {
                currentNode.setPrevious(nodeToInsert);
            }

            previousNode.setNext(nodeToInsert);
            nodeToInsert.setPrevious(previousNode);
        }

        return headNode;
    }

    public static DLLNode deleteDLLNode(DLLNode headNode, int position) {
        int size = getDLLLength(headNode);

        if(position > size || position < 1) {
            System.out.println("Position of node to delete is invalid. The valid inputs are 1 to " + size);

            return headNode;
        }

        if(position == 1) {
            DLLNode currentNode = headNode.getNext();
            headNode = null;
            currentNode.setPrevious(null);
            return currentNode;
        } else {
            DLLNode previousNode = headNode;
            int count = 1;

            while(count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }

            DLLNode currentNode = previousNode.getNext();
            DLLNode laterNode = currentNode.getNext();
            previousNode.setNext(laterNode);

            if(laterNode != null) {
                laterNode.setPrevious(previousNode);
            }
            currentNode = null;
        }

        return headNode;
    }

    public static void printList(DLLNode printNode) {
        while(printNode != null) {
            System.out.println(printNode.getData());
            printNode = printNode.getNext();
        }
    }
}
