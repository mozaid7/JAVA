import java.util.*;

public class addfun {
    public static int calculateSum (int a, int b){
        int sum = a+b;
        Scanner sc = new Scanner(System.in);
        return sum;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = calculateSum(a,b);
    System.out.println("Sum of 2 numbers is " +sum);

    sc.close();
}

}
