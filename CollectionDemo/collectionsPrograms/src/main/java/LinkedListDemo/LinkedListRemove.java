package LinkedListDemo;

import java.util.*;

public class LinkedListRemove{
    public static void main(String args[]){

        LinkedList<String> list=new LinkedList<String>();

        list.add("Sayali");
        list.add("Nupur");
        list.add("Isha");
        list.add("Megha");
        list.add("Rucha");


        list.removeFirst();


        list.removeLast();

        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        list.remove(1);

        System.out.print("\nAfter removing second element: ");

        Iterator<String> iterator2=list.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }

    }
}