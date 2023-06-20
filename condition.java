import java.util.*;
public class conditions {
    public static void main(String args[]){
        int button;
        Scanner sc = new Scanner(System.in);
        button=sc.nextInt();
        if(button == 1){
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");

        } else if (button == 3) {
            System.out.print("Bonjour");

        }
        else {
            System.out.println("Invalid button");
        }
    }
}
