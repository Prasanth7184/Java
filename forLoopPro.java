import java.util.*;
public class forLoopPro {
    public static void main(String args[]){
        System.out.println("Enter the range you want to print the Numbers: ");
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("From: ");
        a=sc.nextInt();
        System.out.print("To: ");
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            System.out.print(i+" ");
        }
    }
}
