package linkedList;

public class LinkedList<T> {
    private static class Node<T>{
        T value;
        Node next;
        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    int size = 0 ;
    Node head = null;

    public void insertAtHead(T value){
        Node current = new Node(value);
        current.next = head;
        head = current;
        size++;
    }

    public void insertAtEnd(T value){
        Node current = new Node(value);
        if(head == null){
            head = current;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = current;
        }size++;
    }

    public int getSize() {
        return size;
    }

}
