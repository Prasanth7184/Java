import java.util.*;
public class inHalfPyNum {
    public static void main(String args[]){
        int a=5;
        for(int i=1;i<=a;i++){
           // System.out.print(i);
            for(int j=1;j<=a-i+1;j++){
                System.out.print(j);
            }
           System.out.println("");
        }
    }
}
