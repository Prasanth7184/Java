import java.util.*;
public class allPatterns {
    public static void main(String args[]) {
        // All patterns
        int n = 4;
        //solid square pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 2 && (j > 1 && j < 5)) || (i == 3 && (j > 1 && j < 5))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("inverted half Pyramid:");
        System.out.println("");
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i < m && j <= m - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Half Pyramid with Numbers:");
        System.out.println("");
        int o = 5;
        for (int i = 1; i <= o; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Inverted Half Pyramid with Numbers:");
        System.out.println("");
        for (int i = 1; i <= o; i++) {
            for (int j = 1; j <= o - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Floy's Triangle:");
        System.out.println("");
        int k = 1;
        for (int i = 1; i <= o; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("0 1 Triangle:");
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int l = i + j;
                if (l % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        int l = 4;
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= 1; j--) {
                if (i <= l && j <= l - i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= 1; j--) {
                if (i >= 1 && j <= l - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= 1; j--) {
                if (i >= 1 && j <= l - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=4;j++){
                if(i>1 && j<=i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        for(int i=1;i<=4;i++){
            for(int j=4;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            if (i > 1) {
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=7;j++){
                if(i==1 && j==5){
                    System.out.print(i);
                } else if (i==2 && (j==3 || j==5)) {
                    System.out.print(i);
                } else if (i==3 && j==2 || j==4 || j==6) {
                    System.out.print(i);
                } else if (i==4 && j==1 || j==3 || j==5 || j==7) {
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        int y=6;
        for(int i=1;i<=y;i++){
            for(int j=1;j<=y-i;j++){
                System.out.print(" ");
            }
            for(int f=1;f<=i;f++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int ab=4;
        for(int i=1;i<=ab;i++){
            for(int j=1;j<=ab-i;j++){
                System.out.print(" ");
            }
            for(int f=1;f<=i;f++){
                System.out.print("* ");
            }
            System.out.println("");
            for(int j=ab;j>=1;j--){
                System.out.print(" ")
            }
        }
    }
}
