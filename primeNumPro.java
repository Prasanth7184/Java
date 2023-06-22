import java.util.*;
public class primeNumPro {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("Enter range to print prime numbers: ");
        System.out.print("From: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print("To: ");
        b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int p=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                   // System.out.print(i);
                    p++;
                }
            }
           // System.out.println("");
            //System.out.println("p= "+p);
            if(p<=2){
                System.out.print(i+" ");
            }
        }
    }
}
