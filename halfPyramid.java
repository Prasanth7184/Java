import java.util.*;
public class halfPyramid {
    public static void main(String args[]){
        System.out.println("/**** Half Pyramid ****/ ");
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
