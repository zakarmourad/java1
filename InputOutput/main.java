package InputOutput;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /*File myObj = null;

        try {
            myObj = new File("C:\\");
            int n = 0;
            if (myObj.exists()){
                for (File e : myObj.listFiles()){
                    if (e.isDirectory()){
                        System.out.printf("%d- /%-25s \t",n+1,e.getName());
                    }else {
                        System.out.printf("%d- %-25s \t",n+1,e.getName());
                    }
                        n++;
                        if (n%4==0) System.out.println();
                    }
                }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        */


        //FileInputStream  ***************  FileOutputStream
        File f = new File("filename.txt");
        File f2 = new File("filename2.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(f2);
            fileInputStream =new FileInputStream(f);
            byte[] buf=  new  byte[10];
            int n = 0;
            long t = System.currentTimeMillis();
            while ((n=fileInputStream.read(buf))>=0){
                for (int i=0;i<n;i++) {
                    // System.out.print((char) buf[i]);
                    fileOutputStream.write((char) buf[i]);
                }
            }
            System.out.println("\ntime :"+(System.currentTimeMillis()-t));
            fileOutputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //BufferedInputStream  ***************  BufferedOutputStream
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("filename.txt"));
            bufferedOutputStream =new BufferedOutputStream(new FileOutputStream("filename2.txt"));
            byte[] buf=  new  byte[10];
            int n = 0;
            long t2 = System.currentTimeMillis();
            while ((n=bufferedInputStream.read(buf))>=0){
                for (int i=0;i<n;i++) {
                    // System.out.print((char) buf[i]);
                    bufferedOutputStream.write((char) buf[i]);
                }
            }
            System.out.println("\ntime :"+(System.currentTimeMillis()-t2));
            bufferedOutputStream.close();
            bufferedInputStream.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
