package linkedList;

public class LinkedList<T> {

    int size = 0;
    public Node head = null;

    @Override
    public String toString() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        return "LinkedList " + "size= " + size + ", head=" + head ;
    }

    public static class Node<T> {
        public T value;
        public Node next;

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

    //delete
    public void deleteAt(int index){
        if(getSize()!=0 && getSize() > index){
            if(index==0){
                head = head.next;
            }else{
                int currentIndex = 0;
                Node temp = head;
                while(currentIndex < index-1){
                    temp = temp.next;
                    currentIndex++;
                }
                temp.next = temp.next.next;
            }
            size--;
            return;
        }
        System.out.println("invalid index "+ index);
    }

    public int getSize() {
        return size;
    }

}
