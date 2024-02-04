import java.util.*;
public class evenseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no till which you want the even series : ");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    sc.close();
    }    
}
