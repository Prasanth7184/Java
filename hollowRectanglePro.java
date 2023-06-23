import java.util.*;
public class hollowRectanglePro {
    public static void main(String args[]){
        int i;
        int j;
        for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                if((i>1 && i<4) && (j>1 && j<5)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        // another method
        int a=4;
        int b=5;
        for(int x=1;x<=a;x++){
            for(int y=1;y<=b;y++){
                if(x==1 || x==a || y==1 || y==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
