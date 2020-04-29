package ArrayListDemo;


import java.util.ArrayList;

import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Vaishnavi");
        fruits.add("Aditi");
        fruits.add("Sushmita");
        fruits.add("Nupur");

        Collections.sort(fruits);

        for (String str : fruits) {
            System.out.println("\n"+str);
        }
    }
}