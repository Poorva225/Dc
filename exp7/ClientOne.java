import java.io.*;
import java.net.*;

public class ClientOne {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 7000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = new PrintStream(s.getOutputStream());
        ServerSocket ss = new ServerSocket(7001);
        BufferedReader in1 = new BufferedReader(new InputStreamReader(ss.accept().getInputStream()));
        PrintStream out1 = new PrintStream(ss.accept().getOutputStream());

        String str = "Token";
        while (true) {
            if (str.equalsIgnoreCase("Token")) {
                System.out.println("Do you want to send some data (Yes/No)?");
                str = br.readLine();
                if (str.equalsIgnoreCase("Yes")) {
                    System.out.println("Enter the data:");
                    out.println(br.readLine());
                }
                out1.println("Token");
            }
            System.out.println("Waiting for Token...");
            str = in1.readLine();
        }
    }
}