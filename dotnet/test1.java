package dotnet;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws IOException {

        //****************** ONE
        /*
        try{
            InetAddress a = InetAddress.getLocalHost();
            System.out.println(a.getCanonicalHostName());
            System.out.println(a.getHostAddress());
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getLoopbackAddress());
        }catch (UnknownHostException e){e.printStackTrace();}
*/
        //***************** TWO
        /*
        try {
            InetAddress a = InetAddress.getByName(new Scanner(System.in).nextLine());
            System.out.println(a.getCanonicalHostName());
        }catch (UnknownHostException e){e.printStackTrace();}
         */
        //*************** Three
        /*
        Socket s = null;
        ServerSocket ss;
        int i;
        for (i=1;i<=80;i++) {
            try {
                ss = new ServerSocket(i);
                s = new Socket(InetAddress.getLocalHost(), i);
                System.out.println("done " + i);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        */
        //***************four
        //script to hack any web site by  mr.gounan
        /*
        Socket socket = null;
        try{
            socket = new Socket("www.este.ucam.ac.ma",80);
            String REG = "GET / HTTP/1.1\r\n";
            REG+="Host: www.este.ucam.ac.ma\r\n";
            REG+="\r\n";
            BufferedOutputStream b= new BufferedOutputStream(socket.getOutputStream());
            b.write(REG.getBytes());
            b.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String n;
            while ((n=bufferedReader.readLine())!=null){
                System.out.println(n);
            }
        }catch (UnknownHostException e){e.printStackTrace();}
        catch (IOException e) { e.printStackTrace(); }
        finally { try { socket.close(); } catch (IOException e) { e.printStackTrace(); }
        }
        */

int i =0;
        for (;;) {
i++;
            //********************SenD Object
            Socket socket = new Socket("192.168.1.10", 1234);
            System.out.println(socket);
            BufferedWriter objectOutputStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            objectOutputStream.write("MALPHITE ROCK POWER");
            System.out.println(i);
            objectOutputStream.close();
        }
        }
}
