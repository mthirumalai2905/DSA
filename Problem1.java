package LinkedLists;

public class Problem1 {

    public class Node {
        public Node next;
        public int value;
    }

    public class SinglyLinkedList {
        public Node head;
        public Node tail;
        public int size;

        public void createSinglyLinkedList(int nodeValue) {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public void traversalSinglyLinkedList() {
            if (head == null) {
                System.out.println("SLL does not exist");
            } else {
                Node tempNode = head;
                while (tempNode != null) {
                    System.out.print(tempNode.value);
                    if (tempNode.next != null) {
                        System.out.print(" -> ");
                    }
                    tempNode = tempNode.next;
                }
                System.out.println();
            }
        }

        public void reversal() {
            Node current = head;
            Node prev = null;
            Node next = null;
        
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
        
            head = prev;
        }
        
    }

    public static void main(String[] args) {
        Problem1 mainObj = new Problem1();
        SinglyLinkedList sLL = mainObj.new SinglyLinkedList();
        sLL.createSinglyLinkedList(1);
        sLL.createSinglyLinkedList(2);
        sLL.createSinglyLinkedList(3);
        sLL.createSinglyLinkedList(4);

        //sLL.traversalSinglyLinkedList();
        sLL.reversal();
        sLL.traversalSinglyLinkedList();
    }
}
