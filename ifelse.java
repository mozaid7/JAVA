import java.util.*;
public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print("The age of the person is = ");
        System.out.println(age);
        if(age>18){
            System.out.println("Adult");
        }else {
            System.out.println("Not Adult");
        }
        sc.close();
        
    }
    
}
