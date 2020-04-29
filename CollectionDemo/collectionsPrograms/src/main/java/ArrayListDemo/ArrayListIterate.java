package ArrayListDemo;

import java.util.*;
class ArrayListIterate{
    public static void main(String args[]){

        ArrayList<String> alist=new ArrayList<String>();

        alist.add("Sayali");
        alist.add("Sagar");
        alist.add("Gunjan");
        alist.add("Neha");
        alist.add("Manisha");

        //iterating ArrayList
        for(String str:alist)
            System.out.println(str);
    }
}