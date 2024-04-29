import java.util.Scanner;
public class Bully{
    static int n, pro[],sta[],co;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Processes");
        n= sc.nextInt();
        pro= new int[n];
        sta= new int[n];
        for(int i=0; i<n;i++){
            System.out.printf("for process %d: \n Status:" ,i+1);
            sta[i]= sc.nextInt();
            System.out.println("Priority:");
            pro[i]= sc.nextInt();
        }
        System.out.println("Which process will initiate the election?");
        elect(sc.nextInt()-1);
        System.out.println("Final Coordinator:"+co);
    }
    static void elect(int ele){
        co= ele+1;
         for(int i=0;i<n;i++){
            if(pro[ele]<pro[i] && sta[i]==1){
                System.out.printf("Election message sent from %d to %d \n", ele+1,i+1);
                elect(i);
            }
        }

        
    }
}