//13. Check if a number is positive, negative, or zero
import java.util.Scanner;
public class PosiNegZero {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Your number is positive: ");
        }else if(n < 0){
            System.out.println("Your number is negative: ");
        }else{
            System.out.println("Your number is ZERO: ");
        }
    }

}
