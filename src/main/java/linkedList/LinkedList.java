package linkedList;

public class LinkedList<T> {

    int size = 0;
    private Node head = null;

    @Override
    public String toString() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        return "LinkedList " + "size= " + size + ", head=" + head ;
    }

    private static class Node<T> {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insertAtHead(T value) {
        Node current = new Node(value);
        current.next = head;
        head = current;
        size++;
    }

    public void insertAtEnd(T value) {
        Node current = new Node(value);
        if (head == null) {
            head = current;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = current;
        }
        size++;
    }

    //sorted insertion
    public void sortedInsert(T value){
        Node current = new Node(value);
        if(head == null || (Integer)head.value >= (Integer)current.value){
            current.next = head;
            head = current;
        }else{
            Node temp = head;
            while(temp.next != null && (Integer)temp.next.value < (Integer)current.value){
                temp = temp.next;
            }current.next = temp.next;
            temp.next = current;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

}
