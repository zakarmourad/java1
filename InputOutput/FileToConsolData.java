package InputOutput;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileToConsolData {
    public static void main(String[] args) {
        /*
        DataInputStream dis;
        DataOutputStream dos;
        try{
            dos=new DataOutputStream( new BufferedOutputStream(new FileOutputStream(new File("filename.txt"))));
            dos.writeFloat(333.33f);
            dos.writeInt(55);
            dos.writeChar('f');
            dos.close();
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("filename.txt"))));
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            dis.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

//******************** beffered time
        File f = new File("filename.txt");
        File f2 = new File("filename2.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        FileChannel fc,fc2;
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
//************* file channel  time
        try {
            fileInputStream = new FileInputStream(f);
            fileOutputStream = new FileOutputStream(f2);
            fc = fileInputStream.getChannel();
            fc2 = fileOutputStream.getChannel();
            int size = (int) fc.size();
            ByteBuffer byteBuffer = ByteBuffer.allocate(size);
            long t3 = System.currentTimeMillis();
            fc.read(byteBuffer);
            fc2.write(byteBuffer);

            byteBuffer.flip();
            System.out.println(" 5656time : "+(System.currentTimeMillis() - t3));
            byte[] tabbyte = byteBuffer.array();

        }catch (Exception e) {e.getMessage();}

    }
}
