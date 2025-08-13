import java.util.Scanner;

 public class swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER THE FIRST NUMBER : ");
        int num1 = input.nextInt();
        System.out.print("PLEASE ENTER THE SECOND NUMBER : ");
        int num2 = input.nextInt();
        System.out.print("\nBEFORE SWAPPING THE NUMBER'S\n");
        System.out.print("FIRST NUMBER IS : "+num1);
        System.out.print("\nSECOND NUMBER IS : "+num2);
        System.out.print("\n\nAFTER SWAPPING THE NUMBER'S\n");
        int temp = num1;
        num1=num2;
        num2= temp;
        System.out.print("FIRST NUMBER BECOME : "+num1);
        System.out.print("\nSECOND NUMBER BECOME : "+num2);
    }
}
