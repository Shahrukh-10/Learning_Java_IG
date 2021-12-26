package com.ingenuity.treeSet;

import java.util.HashMap;
import java.util.Iterator;

public class Set_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>  hs  = new HashMap<>();
        hs.put("one",1);
        hs.put("two",2);
        hs.put("three",3);

        System.out.println(hs.size());

        if (hs.containsValue(1)){
            System.out.println("hashmap contains value : 1");
        }else {
            System.out.println("Hashmap does not contains value : 1");
        }

        if (hs.containsKey("One")){
            System.out.println("hashmap contains key : One");
        }else {
            System.out.println("Hashmap does not contains key : One");
        }


        Integer n = (Integer) hs.get("One");
        System.out.println("Value mapped with one is : "+n);


        System.out.println("Retrieving all keys from HashMap");
        Iterator itr = hs.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Retrieving all Values from HashMap");
        Iterator i = hs.values().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
