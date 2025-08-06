
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("ENTER TE SECOND NUMBER : ");
        int num2 = input.nextInt();
         int sum = num1+num2;
         System.out.print("THE SUM OF TWO NUMBER IS :"+ sum);
    }
    
}
