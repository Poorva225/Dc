import java.io.DataInputStream;
import java.net.*;
public class MyServer
{
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6668);
            Socket s= ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str=din.readUTF();
            System.out.println("Message:" +str);
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
