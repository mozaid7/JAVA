import java.util.*;
public class oddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("The no to check is = ");
        System.out.println(x);
        if(x%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        sc.close();
        
    }
    
}
