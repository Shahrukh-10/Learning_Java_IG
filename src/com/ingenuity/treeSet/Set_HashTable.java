package com.ingenuity.treeSet;

import java.util.Enumeration;
import java.util.Hashtable;

public class Set_HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> hst = new Hashtable<>();

        Enumeration<String> names;
        String name;

        hst.put("zen",500000);
        hst.put("zfdfen",500000);
        hst.put("zwwwwwwwwwen",500000);
        hst.put("zwen",500000);

        names = hst.keys();
        while (names.hasMoreElements()){
            name = names.nextElement();
            System.out.println(name + " : " + hst.get(name));
        }
    }
}
