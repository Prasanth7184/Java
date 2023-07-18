import java.util.*;
public class arrayPro {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // Question: 1 => Take array of names as input from the user and print them of screeen
        System.out.println("Enter the how many names would you like to enter:");
        int n=sc.nextInt();
        String[] names=new String[n];
        System.out.println("Now enter the names:");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        System.out.println("You enter names are:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        // Question:2 => Find Minimum and Maximum number in an array of integers ?
        System.out.println("We find now macx and min numbers in an array of integers:\nEnteter size of an array:");
        int n1=sc.nextInt();
        int num[]=new int[n1];
        for(int i=0;i<n1;i++){
            num[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Min number is: "+min);
        System.out.println("Max number is: "+max);
        // Problem:3 => Take an array of numbers as input and check if it is an array sorted in ascending order ?
        System.out.println("--Now we check an array of numbers are stored in ascending order or not--\n Enter the size of an array:");
        int n2=sc.nextInt();
        int num2[]=new int[n2];
        System.out.println("Enter the numbers:");
        for(int i=0;i<n2;i++){
            num2[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<num2.length-1;i++){
            if(num2[i]>num[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
