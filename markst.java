import java.util.*;
public class markst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("Enter the marks of the student = ");
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            } else if(marks>=60 && marks<=89){
                System.out.println("This is also Good");
            } else if(marks>=0 && marks<=59){
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }

            System.out.println("Do you want to continue ? If yes (1) else (0)");
            input = sc.nextInt();
        } while(input==1);


    sc.close();
    }
    
}
