import java.util.Scanner;

public class elseIfPro {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter Your Marks: ");
        m=sc.nextInt();
        if(m<35){
            System.out.println("Fail");
        } else if (m>=35 && m<50) {
            System.out.println("C Grade");
            
        } else if (m>=50 && m<75) {
            System.out.println("B Grade");
            
        } else if (m>=75 && m<90) {
            System.out.println("A Grade");

        } else if (m>=90 && m<=100) {
            System.out.println("A+ Grade");

        }
        else {
            System.out.println("Invalid...!");
        }
    }
}
