import java.util.Scanner;
public class Load{
    static void printLoad(int s, int p) {
        for (int i = 0, e = p / s, x = p % s; i < s; i++) {
            int t = x-- > 0 ? e + 1 : e;
            System.out.println("Server " + (char) ('A' + i) + " has " + t + " Processes");
        }
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter servers and Processes:");
        int s = sc.nextInt();
        int p = sc.nextInt();
        while (true) {
            printLoad(s, p);
            System.out.print("1.Add 2.Remove Servers 3.Add 4.Remove Processes 5.Exit: ");
            switch(sc.nextInt()) {
                case 1 -> {
                    System.out.println("How many more servers to add?");
                    s += sc.nextInt();
                }
                case 2 -> {
                    System.out.println("How many servers to remove?");
                    s -= sc.nextInt();
                }
                case 3 -> {
                    System.out.println("How many more processes to add?");
                    p += sc.nextInt();
                }
                case 4 -> {
                    System.out.println("How many more processes to remove?");
                    p -= sc.nextInt();
                }
                case 5 -> System.exit(0);
            }
        }
    }
}