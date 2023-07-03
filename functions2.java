import java.util.*;
public class functions2 {
    public static void main(String args[]){
        // Make a function to check if a number is prime or not ?
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        checkPrime(a);
        // Make a function to check if a number is even or not ?
        checkEven(a);
        // Make a function to print the table of a given number n ?
        table(a);
    }
    public static void checkPrime(int a){
        int n=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                n=n+1;
            }
        }
        if(n<=2){
            System.out.println(a+" is Prime");
        }
        else{
            System.out.println(a+" is not Prime");
        }
    }
    public static void checkEven(int a){
        if(a%2==0){
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+" is Odd");
        }
    }
    public static void table(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }
}
