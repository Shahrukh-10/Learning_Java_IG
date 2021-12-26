package com.ingenuity.collections;

import java.util.Iterator;
import java.util.Vector;

public class List_Vector {
    public static void main(String[] args) {
        Vector<String>  vct = new Vector<>();
        vct.add("first");
        vct.add("second");
        vct.add("third");
        vct.add(2,"Random");
        System.out.println(vct.get(3));
        System.out.println(vct.firstElement());
        System.out.println(vct.lastElement());
        System.out.println(vct.isEmpty());

        System.out.println( " Using iterator ....");

        Iterator itr = vct.iterator();
        while (itr.hasNext()){
            Object i  = itr.next();
            System.out.println(i.toString());
        }
    }
}
