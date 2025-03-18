package linkedList.SomeOperations;


import linkedList.LinkedList;

//This class contains method to reverse a given linkedList
public class ReverseLinkedList {
    //method to reverse a linked list
    public static void reverse(LinkedList<Integer> list){

        if(list== null){
            return;
        }
        if(list.head == null){
            return;
        }

        LinkedList.Node<Integer> prev = null;
        LinkedList.Node<Integer> curr = list.head;
        LinkedList.Node<Integer> next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        list.toString();
    }

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.sortedInsert(5);
        l.sortedInsert(5);
        l.sortedInsert(35);
        l.sortedInsert(25);
        l.sortedInsert(115);
        l.toString();
        reverse(l);
    }
}
