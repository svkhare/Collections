package ArrayListDemo;

import java.util.ArrayList;
public class ArrayListChange {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Pranali");
        names.add("Sagar");
        names.add("Gunjan");
        names.add("Neha");
        names.add("Manjusha");
        names.add("Manisha");
        names.set(0, "Sayali");
        System.out.println(names);
    }
}