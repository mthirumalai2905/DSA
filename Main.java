package LinkedLists;

public class Main {

    public class Node {
        public int value;
        public Node next;
    }

    //CREATION OF SINGLY LINKEDLISTS
    public class SinglyLinkedList {
        public Node head;
        public Node tail;
        public int size;

        public Node createSinglyLinkedList(int nodeValue) {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;

            head = node;
            tail = node;
            size = 1;
            return head;
        }

        
//INSERTION IN SINGLY LINKEDLISTS
public void insertInLinkedList(int nodeValue, int location){
    Node node = new Node();
    node.value = nodeValue;
    if(head == null){
        createSinglyLinkedList(nodeValue);
        return;
    } else if(location == 0){
        node.next = head;
        head = node;
    } else if(location >= size){
        node.next = null;
        tail.next = node;
        tail = node;
    } else {
        Node tempNode = head;
        int index = 0;
        while(index < location - 1){
            tempNode = tempNode.next;
            index++;
        }
        Node nextNode = tempNode.next;
        tempNode.next = node;
        node.next = nextNode;
    }
    size++;
}

//TRAVERSAL IN SINGLY LINKEDLISTS
public void traversalSinglyLinkedList(){
    if(head == null){
        System.out.println("SLL does not exist");
    } else {
        Node tempNode = head;
        for(int i =0; i<size; i++){
            System.out.println(tempNode.value);
            if(i != size - 1){
                System.out.println(" -> ");
            }
            tempNode = tempNode.next;
        }
    }
    System.out.println("\n");
}

//SEARCHING IN SINGLYLINKEDLISTS

boolean searchNode(int nodeValue){
    if(head != null){
        Node tempNode = head;
        for(int i=0; i<size; i++){
            if(tempNode.value == nodeValue){
                System.out.println("Found the element at location " + i);
                return true;
            }
            tempNode = tempNode.next;
        }
    }
    System.out.println("Node not found");
    return false;
}


//DELETING A NODE FROM SINGLY LINKEDLISTS 
public void deletionOfNode(int location){
    if(head == null){
        System.out.println(" The SLL doesnt exists");
        return;
    } else if(location == 0){
        head = head.next;
        size--;
        if(size == 0){
            tail = null;
        }
    }else if(location >= size){
        Node tempNode = head;
        for(int i = 0; i < size - 1; i++){
            tempNode = tempNode.next;
        }
        if(tempNode == head){
            tail = head = null;
            size--;
            return;
        }
        tempNode.next = null;
        tail = tempNode;
        size--;
    } else {
        Node tempNode = head;
        for(int i = 0; i < location-1; i++){
             tempNode = tempNode.next;
        }
        tempNode = tempNode.next.next;
            size--;
    }
}


}

    public static void main(String[] args) {
        Main mainObj = new Main();
        SinglyLinkedList sLL = mainObj.new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        System.out.println(sLL.head.value);
    }

}
