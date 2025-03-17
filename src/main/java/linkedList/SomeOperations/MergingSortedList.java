package linkedList.SomeOperations;


import linkedList.LinkedList;

//Given two sorted linked list, merge them into single sorted linked list
public class MergingSortedList {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.sortedInsert(5);
        l1.sortedInsert(15);
        l1.sortedInsert(35);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.sortedInsert(2);
        l2.sortedInsert(115);
        l2.sortedInsert(225);
        l2.sortedInsert(1150);
        sort(l1,null);
    }
    //assuming both list are already sorted
    public static void sort(LinkedList l1, LinkedList l2){
        LinkedList.Node<Integer> p = l1.head;
        LinkedList.Node<Integer> q = l2.head;
        LinkedList.Node<Integer> sorting = null ;
        LinkedList<Integer> merged = new LinkedList<>();

        if(p == null){
            return;
        }if(q == null){
            return;
        }

        if(p!=null && q!=null){
            if(p.value > q.value){
                sorting = q;
                merged.insertAtEnd(sorting.value);
                q=q.next;
            }else{
                sorting = p;
                merged.insertAtEnd(sorting.value);
                p=p.next;
            }
        }

        while(p!=null && q!=null){
            if(p.value > q.value){
                sorting = q;
                q = q.next;
                merged.insertAtEnd(sorting.value);
            }else{
                sorting = p;
                p = p.next;
                merged.insertAtEnd(sorting.value);
            }
        }
        if(p == null){
            while(q !=null){
                sorting = q;
                merged.insertAtEnd(sorting.value);
                q=q.next;
            }
        }if(q == null){
            while(p !=null){
                sorting = p;
                merged.insertAtEnd(sorting.value);
                p=p.next;
            }
        }
        merged.toString();
    }
}
