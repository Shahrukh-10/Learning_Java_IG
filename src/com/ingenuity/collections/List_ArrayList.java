package com.ingenuity.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class List_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("JAVA");
        al.add("PERL");
        al.add("C++");
        al.add("RUBY");
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

        System.out.println("Element at index 1 : "+al.get(0));
        System.out.println("Does list contain java : "+al.contains("JAVA"));

        al.add(2,"play");
        System.out.println(al);

        System.out.println(al.isEmpty());
        System.out.println(al.indexOf("PERL"));
        System.out.println(al.size());

        System.out.println(" Using iterator ....");

        Iterator i = al.iterator();
        while (i.hasNext()){
            System.out.println(i.next().toString() + " ");
        }
    }
}
