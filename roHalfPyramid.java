import java.util.*;
public class roHalfPyramid {
    public static void main(String args[]){
        int a=4;
        //outer loop
        for(int i=1;i<=a;i++){
            // inner loop -> space print
            for(int j=1;j<=a-1;j++){
                System.out.print(" ");
            }
            // inner loop -> star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
