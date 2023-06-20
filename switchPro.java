import java.util.*;
public class switchPro {
    public static void main(String args[]){
        int button;
        Scanner sc=new Scanner(System.in);
        button=sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Buttton");
        }
    }
}
