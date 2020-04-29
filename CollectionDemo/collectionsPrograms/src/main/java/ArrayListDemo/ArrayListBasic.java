package ArrayListDemo;

import java.util.*;


public class ArrayListBasic {

    public static void main(String args[]){


        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Sayali");
        alist.add("Sagar");
        alist.add("Gunjan");
        alist.add("Neha");
        alist.add("Manjusha");
        alist.add("Manisha");

        //displaying elements
        System.out.println(alist);

        //Adding "Steve" at the fourth position
        alist.add(3, "Sayali");

        //displaying elements
        System.out.println(alist);
    }
}
