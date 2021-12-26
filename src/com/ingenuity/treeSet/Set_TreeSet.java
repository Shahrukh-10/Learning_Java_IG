package com.ingenuity.treeSet;

import java.util.TreeSet;

public class Set_TreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("a");
        System.out.println(ts);
        System.out.println(ts.isEmpty());
        ts.clear();
        System.out.println(ts.isEmpty());
        ts.add("three");
        ts.add("one");
        ts.add("two");
        ts.add("a");
        ts.remove("three");
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
