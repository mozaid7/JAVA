import java.util.*;
public class sumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value till the no you want the sum = ");
        int n = sc.nextInt();
        int sum =0;
        int i;
        for (i=1; i<=n; i++){
            sum = sum+i;
        }
        System.out.println("The sum of the no are = "+sum);
     sc.close();
    }
    
}
