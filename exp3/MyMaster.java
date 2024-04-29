
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyMaster{
    public static void main(String[] args) {
        try(
            Socket s = new Socket("localhost", 6668);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the first number");
            dout.writeInt(sc.nextInt());
            System.out.println("Enter the second number");
            dout.writeInt(sc.nextInt());
                
            
           
}catch(Exception e){
    System.out.println(e);
}
    }
}
