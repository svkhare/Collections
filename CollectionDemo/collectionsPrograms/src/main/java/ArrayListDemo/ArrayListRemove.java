package ArrayListDemo;

import java.util.*;

public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Sayali");
        alist.add("Sagar");
        alist.add("Gunjan");
        alist.add("Neha");
        alist.add("Manjusha");
        alist.add("Manisha");

        //displaying elements
        System.out.println(alist);

        //Removing "Steve" and "Angela"
        alist.remove("Sayali");
        alist.remove("Sagar");

        //displaying elements
        System.out.println(alist);

        //Removing 3rd element
        alist.remove(2);

        //displaying elements
        System.out.println(alist);
    }
}
