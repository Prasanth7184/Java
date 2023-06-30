import java.util.*;
public class pattern2 {
    public static void main(String args[]){
        int a=4;
        for(int i=1;i<=a;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = a; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=4;i>=1;i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = a; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        int b=5;
        for(int i=1;i<=b;i++){
            for(int j=1;j<=b-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
         for(int i=1;i<=a;i++){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             for(int j=1;j<=2*(a-i);j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println("");
         }
         for(int i=a;i>=1;i--){
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             for(int j=1;j<=2*(a-i);j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println("");
        }
         System.out.println("");
         for(int i=1;i<=a;i++){
             for(int j=1;j<=a-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print(i+" ");
             }
             System.out.println("");
         }
         System.out.println("");
         for(int i=1;i<=a;i++){
             for(int j=1;j<=a-i;j++){
                 System.out.print(" ");
             }
             for(int j=i;j>=1;j--){
                 System.out.print(j);
             }
             if(i>=2){
                 for(int j=2;j<=i;j++){
                     System.out.print(j);
                 }
             }
             System.out.println("");
         }
         System.out.println("");
         for(int i=1;i<=a;i++){
             for(int j=1;j<=a-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             if(i>=2){
                 for(int j=2;j<=i;j++){
                     System.out.print("*");
                 }
             }
             System.out.println("");
         }
         for(int i=a;i>=1;i--){
             for(int j=1;j<=a-i;j++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                 System.out.print("*");
             }
             if(i>=2){
                 for(int j=2;j<=i;j++){
                     System.out.print("*");
                 }
             }
             System.out.println("");
         }
    }
}
 c