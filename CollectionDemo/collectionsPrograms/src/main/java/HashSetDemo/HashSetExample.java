package HashSetDemo;

import java.util.HashSet;
public class HashSetExample
{
    public static void main(String args[]) {

        HashSet<String> hset = new HashSet<String>();

        hset.add("Sayali");
        hset.add("Manisha");
        hset.add("Manjusha");
        hset.add("Pinak");
        hset.add("Akshata");
        hset.add("Kinnari");

        hset.add("Sayali");
        hset.add("Manisha");

        hset.add(null);
        hset.add(null);

        System.out.println(hset);
    }
}