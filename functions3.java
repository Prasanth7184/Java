import java.util.*;
public class functions3 {
    public static void main(String args[]){
        // Q: 1 => Enter 3 numbers from the user and make a function to print their average ?
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        findAverage(a,b,c);
        // Q: 2 => Write a function to print the sum of all odd numbers from 1 to n ?
        System.out.println("");
        System.out.println("Enter a number to find sum of odd numbers: ");
        int d=sc.nextInt();
        sumOdd(d);
        System.out.println("");
        // Q:3 => Write a function which takes in 2 numbers and return the greater of those two ?
        System.out.println("Enter any two number to find which greater: ");
        int e=sc.nextInt();
        int f=sc.nextInt();
        greater(e,f);
        // Q:4 => Write a function that takes in the radius as input and returns the circumference of a circle ?
        System.out.println("");
        System.out.print("Enter the Radius: ");
        int g=sc.nextInt();
        circumference(g);
        System.out.println("");
        System.out.print("Enter Your Age: ");
        int h=sc.nextInt();
        vote(h);
        System.out.println("");
        /* Q: 6 => Write an infinite loop using do while condition ?
        int i=1;
        do{
            System.out.println("Infinite Loop");
        }
        while(i!=0);{
            i++;
        }
         */
        System.out.println("");
        // Q: 7 => Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered ?
        System.out.println("Enter how many number you need to enter: ");
        int j=sc.nextInt();
        display(j);
        // Q: 8 => Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n ?
        System.out.println("");
        // Q: 9 => Write a function that calculates the Greatest Common Divisor of 2 numbers ?
        System.out.println("Enter any two numbers to find the greatest common divisor:");
        int k=sc.nextInt();
        int l=sc.nextInt();
        divisor(k,l);

    }
    public static int findAverage(int a, int b, int c){
        int d=a+b+c;
        int e=d/3;
        System.out.print("Average of "+a+" "+b+" "+c+" is: "+e);
        return 1;
    }
    public static void sumOdd(int d){
        int e=0;
        for(int i=1;i<=d;i++){
            if(i%2==1){
                e=e+i;
            }
        }
        System.out.print("Sum of all odd numbers from 1 to "+d+" is: "+e);
    }
    public static void greater(int e,int f){
        if(e>f){
            System.out.println(e+" is greater then "+f);
            return;
        } else if (e==f) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println(f+" is greater then "+e);
        }
    }
    public static void circumference(int g){
        int h=2*g;
        float i= (float) ((3.14)*h);
        System.out.println("The circumference is: "+i);
    }
    public static void vote(int h) {
        if (h > 18) {
            System.out.println("You are Eligible");
        } else {
            System.out.println("You are Not Eliglible");
        }
    }
    public static void display(int j){
        Scanner sc=new Scanner(System.in);
        int k[]=new int[100];
        int zeros=0,pos=0,neg=0;
        System.out.println("Enter the numbers:");
        for(int i=1;i<=j;i++){
            k[i]=sc.nextInt();
        }
        for(int i=1;i<=j;i++){
            if(k[i]==0){
                zeros=zeros+1;
            } else if (k[i]>0) {
                pos=pos+1;
            } else if (k[i]<0) {
                neg=neg+1;
            }
        }
        System.out.println("Total Zeros are: "+zeros);
        System.out.println("Total Positive Numbers are: "+pos);
        System.out.println("Total Negative Numbers are: "+neg);
    }
    public static void divisor(int k,int l){
        int n=0;
        for(int m=1;m<=k && m<=l;m++){
            if(k%m==0 && l%m==0){
                n=m;
            }
        }
        System.out.println("The Greatest Common Divisor of two numbers is: "+n);

    }

}
