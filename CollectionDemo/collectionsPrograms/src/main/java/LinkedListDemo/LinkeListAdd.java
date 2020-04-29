package LinkedListDemo;

import java.util.*;

public class LinkeListAdd {

    public static void main(String args[]){

        LinkedList<String> list=new LinkedList<String>();


        list.add("Sayali");
        list.add("Nupur");
        list.add("Isha");

        list.addFirst("Megha");

        list.addLast("Rucha");

        list.add(2, "Rasika");

        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
