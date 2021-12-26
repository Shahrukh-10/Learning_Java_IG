package com.ingenuity.fileHandling;

import java.io.*;

public class Serialization {
//TODO SAVING OF OBJECTS IN FILE IS CALLED SERIALIZATION AND READING OF OBJECTS FROM A FILE IS CALLED DESERIALIZATION
    public static void main(String[] args) {

        try {
//            OBJECT SERIALIZATION
            MyClass obj = new MyClass("Shahrukh",007);
            FileOutputStream out = new FileOutputStream("C:\\Users\\Shahrukh\\IdeaProjects\\JAVA TRAINING\\src\\com\\ingenuity\\fileHandling\\Serializable(ObjectWrite).txt");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(obj);
            oos.flush();
            System.out.println("Object Saved");

        }catch (Exception e){
            System.out.println("Exception : "+e);
            System.exit(0);
        }

        try{
//            OBJECT DESERIALIZATION
            FileInputStream in = new FileInputStream("C:\\Users\\Shahrukh\\IdeaProjects\\JAVA TRAINING\\src\\com\\ingenuity\\fileHandling\\Serializable(ObjectWrite).txt");
            ObjectInputStream ois = new ObjectInputStream(in);
            MyClass ob = (MyClass)ois.readObject();
            System.out.println(ob);
        }catch (Exception e){
            System.out.println("Exception"+e);
        }

    }
}
class MyClass implements Serializable{
    String name ;
    double no;
    MyClass(String name , double no){
        this.name = name;
        this.no = no;
    }
    public String toString(){
        return "Name : "+name+" No : "+no;
    }

}
