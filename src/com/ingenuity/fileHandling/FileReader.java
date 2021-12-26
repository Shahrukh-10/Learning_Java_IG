package com.ingenuity.fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in = new FileInputStream("C:\\Users\\Shahrukh\\IdeaProjects\\JAVA TRAINING\\src\\com\\ingenuity\\fileHandling\\testRead.txt");
            out = new FileOutputStream("C:\\Users\\Shahrukh\\IdeaProjects\\JAVA TRAINING\\src\\com\\ingenuity\\fileHandling\\testWrite.txt");
            int c ;
            while ((c = in.read())!=-1){
                out.write(c);
            }
            System.out.println("File copied successfully .... ");

        }
        finally {
            if (in != null){
                in.close();
            }if(out != null){
                out.close();
            }
        }

    }
}
