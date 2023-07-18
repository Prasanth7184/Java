import java.util.Scanner;

public class numbers {
    public static void main(String args[]){
        // Reverse Numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("1) We reverse a given number ");
        System.out.println("Enter any Numbers: ");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse of a number is: "+rev);
        System.out.println("");
        System.out.println("2) We check a number is Palindrome or not ");
        System.out.println("Enter any number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println(num+" is Palindrome");
        }else{
            System.out.println(num+" is not Palindrome");
        }
        System.out.println("");
        System.out.println("3) We check a given number is Prime or not ");
        System.out.println("Enter any number: ");
        int num1=sc.nextInt();
        int sum1=0;
        for(int i=1;i<=num1;i++){
            if(num1%2==0){
                sum1=sum1+1;
            }
        }
        if(sum1<=2){
            System.out.println(num1+" is a prime number");
        }
        else{
            System.out.println(num1+" is not a prime number");
        }
        System.out.println("");
        System.out.println("4) We check a given number is perfect or not ");
        int num2=sc.nextInt();
        int sum2=0;
        for(int i=1;i<num2;i++){
            if(num2%i==0){
                sum2=sum2+i;
            }
        }
        if(num2==sum2){
            System.out.println(num2+" is a Perfect number");
        }else{
            System.out.println(num2+" is not a Perfect number");
        }
        System.out.println("");
        System.out.println("5) We check a given number is Strong number or not");
        System.out.println("Enter any number");
        int num3=sc.nextInt();
        int sum3;
        int total3=0;
        int val3=num3;
        int rem3;
        int i3;
        while(val3!=0){
            rem3=val3%10;
            i3=1;
            sum3=1;
            while(i3<=rem3){
                sum3=sum3*i3;
                i3++;
            }
            total3=total3+sum3;
            val3=val3/10;
        }
        if(total3==num3){
            System.out.println(num3+" is a Strong number");
        }else{
            System.out.println(num3+" is not a Strong number");
        }
        System.out.println("");
        System.out.println("6) We check a given number is sunny number or not");
        int num4=sc.nextInt();
        int n4=num+1;
        int sum4=1;
        int i4=1;
        int total4=1;
        while(n4>total4){
            sum4=i4*i4;
            if(sum4==n4){
                total4=sum4;
            }
            i4++;
        }
        if(total4==n4){
            System.out.println("Sunny");
        }
        else{
            System.out.println("not");
        }
    }
}