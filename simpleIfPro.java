import java.util.Scanner;

public class simpleIfPro {
    public static void main(String[] args)
    {   int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks:");
        a = sc.nextInt();
       if(a>=35){
           System.out.println("You are Passed.");
       }
       else{
           System.out.println("You are Falied.");
       }
    }

}
