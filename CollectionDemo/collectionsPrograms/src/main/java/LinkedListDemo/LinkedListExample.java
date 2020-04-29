package LinkedListDemo;

import java.util.*;

public class LinkedListExample {
    public static void main(String args[]) {


        LinkedList<String> linkedlist = new LinkedList<String>();


        linkedlist.add("Sayali");
        linkedlist.add("Nupur");
        linkedlist.add("Isha");
        linkedlist.add("Megha");
        linkedlist.add("Rucha");


        System.out.println("Linked List Content: " +linkedlist);


        linkedlist.addFirst("Manisha");
        linkedlist.addLast("Neha");
        System.out.println("LinkedList Content after addition: " +linkedlist);


        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Manisha Gupta");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);


        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);


        linkedlist.add(0, "Sagar");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);
    }
}