import java.util.*;
public class lessmore {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == b){
            System.out.println("equal");
        }else if (a>b) {
            System.out.println("A is greater than b");
        }else{
            System.out.println("A is lesser than b");
        }
        sc.close();
        
    }
    
}

