package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListSize {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(4);
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);

        System.out.println("Number of elements in ArrayList: "+numbers.size());
    }
}