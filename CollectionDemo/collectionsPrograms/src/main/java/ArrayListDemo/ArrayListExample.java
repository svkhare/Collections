package ArrayListDemo;

import java.util.*;

public class ArrayListExample {

    public static void main(String args[]) {

        List<String> obj = new ArrayList<String>();

        obj.add("Sayali");
        obj.add("Sagar");
        obj.add("Gunjan");
        obj.add("Neha");
        obj.add("Manjusha");



        System.out.println("\n  \nOriginal ArrayList:");
        for(String str:obj)
            System.out.println(str);


        obj.add(0, "Pragati");
        obj.add(1, "Disha");


        System.out.println("\n  \nArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);

        obj.remove("Manjusha");
        obj.remove("Neha");

        System.out.println("\n \nArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);

        obj.remove(1);

        System.out.println("\n \nFinal ArrayList:");
        for(String str:obj)
            System.out.println(str);
    }

}
