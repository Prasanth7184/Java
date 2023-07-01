import java.util.*;
public class functions {
    public static void printMyName(String name){
        System.out.println(name);
        return; // Optional because returntype is void
    }
    public static int calculateSum(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String args[]){
        System.out.print("Enter Your Name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        // Q:1 => print a given name in a function
        printMyName(name);
        // Q:2 => Make a function to add 2 numbers and retutn the sum
        System.out.print("Eter 'a' and 'b' values: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("Sum of a and b is: "+sum);
        // Q:3 => Make a function to product 2 numbers and return product
        System.out.println("Product of a and b is: "+calculateProduct(a,b));
        // Q:4 => Find the factorial of number n ?
        System.out.print("Enter factorial number: ");
        int n=sc.nextInt();
        calculateFactorial(n);
    }
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial n number is: "+factorial);
    }
    public static int calculateProduct(int a,int b){
        return a*b; //return by value => advanced
    }
}
