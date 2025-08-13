import java.util.Scanner;

public class three_integer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER [A] : ");
        int num1 = input.nextInt();
        System.out.print("ENTER THE SECOND NUMBER [B] : ");
        int num2 = input.nextInt();
        System.out.print("ENTER THE THIRD NUMBER [C] : ");
        int num3 = input.nextInt();
        if(num1 != num2 && num2 !=num3 && num3 !=num1) {
            if (num1 < num2 && num2 < num3) {
                System.out.print("Strictly Increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.print("Strictly Decreasing");
            } else if (num2 > num1 && num2 > num3) {
                System.out.print("Middle Number is Largest");
            } else {
                System.out.print("NO SPECIFIC PATTERN");
            }
        }else{
            System.out.print("Number are not all different");

            }
        }
    }

