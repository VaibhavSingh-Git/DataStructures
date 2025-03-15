package linkedList;

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;
    int size = 0;

    //node class
    private static class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertAtBeginning(int value){
        Node temp = new Node(value);
        if(head == null){
            head = temp;
            tail = temp;
        }else{
            head.prev = temp;
            temp.next = head;
            head = temp;
        }size++;
    }

    public void insertAtEnd(int value){
        Node temp = new Node(value);
        if(head == null){
            head = temp;
        }else{
            temp.prev = tail;
        }
        tail = temp;
        size++;
    }

//    public void insertAtPosition(int value, int position){
//        Node temp = new Node(value);
//
//    }
}
