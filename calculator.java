import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of A and B = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the operator you want to appply = ");
        int operator = sc.nextInt();
        /* + ---> 1
         * - ---> 2
         * * ---> 3
         * / ---> 4
         * % ---> 5
         */
        
        



        switch(operator){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("Enter a valid operator");
            break;
        }
        
       sc.close(); 
    }
    
}
