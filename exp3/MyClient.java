
import java.io.*;
import java.net.*;

public class MyClient{
    public static void main(String[] args) {
        try(Socket s = new Socket("localhost", 6667);
            DataInputStream dis = new DataInputStream(s.getInputStream())) {
                System.out.println("Waiting for message");
            System.out.println("Received Message:"+dis.readInt()) ;
            }
            catch(Exception e){
                System.out.println(e);
            }
            
    }
}