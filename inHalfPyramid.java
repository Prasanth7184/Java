import java.util.*;
public class inHalfPyramid {
    public static void main(String args[]){
        for(int i=1;i<=7;i++){
            for(int j=i;j<=7;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        //another method
        System.out.println("Another Method: ");
        System.out.println("");
        int a=7;
        for(int x=a;x>=1;x--){
            for(int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
