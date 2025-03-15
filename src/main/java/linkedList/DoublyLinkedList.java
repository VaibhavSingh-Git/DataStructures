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
    //insert at the head of list
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

    //insert at the end of list
    public void insertAtEnd(int value){
        Node temp = new Node(value);
        if(head == null){
            head = temp;
        }else{
            temp.prev = tail;
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    //insert at specific position
    public void insertAtPosition(int value, int position){
        Node node = new Node(value);
        if(position == 0){
            insertAtBeginning(value);
        }
        else if(head == null && position > 0 ){
            System.out.println("Invalid position "+position);
        }else if(position > size){
            System.out.println("Invalid position "+position);
        }else{
            int count = 0;
            Node temp = head;
            while(count != position && temp.next!=null){
                temp = temp.next;
                count++;
            }
            node.prev = temp.prev;
            node.next = temp;
            temp.prev.next = node;
            temp.prev = node;
            size++;
        }
    }

    //print list
    public void print(){
        Node temp = head;
        while (temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
