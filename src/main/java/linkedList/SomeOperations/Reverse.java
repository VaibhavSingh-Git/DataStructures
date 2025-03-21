package linkedList.SomeOperations;


import linkedList.LinkedList;
import linkedList.Node;

//This class contains methods to reverse a given linkedList
public class Reverse {
    //method to reverse a linked list
    public static void reverse(LinkedList<Integer> list){

        if(list== null){
            return;
        }
        if(list.head == null){
            return;
        }

        Node<Integer> prev = null;
        Node<Integer> curr = list.head;
        Node<Integer> next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        list.toString();
    }

    //recursive method for reversing a linked list
    public static Node reverse(Node head){
        if(head ==null){
            return null;
        }
        Node p ,q;
        p = head;
        q = p.next;
        if(q == null){
            return p;
        }
        q = reverse(q);
        p.next.next = p;
        p.next = null;
        return q;
    }


    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.sortedInsert(5);
        l.sortedInsert(5);
        l.sortedInsert(35);
        l.sortedInsert(25);
        l.sortedInsert(115);
        //l.toString();
        l.head = reverse(l.head);
        l.toString();
        //reverse(l);
    }
}
