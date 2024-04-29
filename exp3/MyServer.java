import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyServer{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6668);
            Socket s= ss.accept();
            System.out.println("Waiting for master to connect");
            int n = new Scanner(System.in).nextInt();
            Socket[] s1 = new Socket[n];
            for(int i=0; i<n; i++){
                s1[i]= ss.accept();
                System.out.println("Slave"+(i=1)+"Connected");
            }
            DataInputStream dis= new DataInputStream(s.getInputStream());
            int x= dis.readInt();
            int y= dis.readInt();
            System.out.println("Received Message:" +(x+y));
            dis.close();
            for(Socket slave : s1){
                DataOutputStream dout= new DataOutputStream(slave.getOutputStream());
                dout.write(x+y);
                dout.close();
            }
            System.out.println("Disconnecting");
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}