import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no whose table you want = ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++){
         System.out.println(n*i);
        }
    
    
        sc.close();
    }
    
}
