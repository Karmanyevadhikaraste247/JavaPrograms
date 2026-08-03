//22. Check if a number is a multiple of another number.
import java.util.Scanner;
public class Q22_MulOfAnotherNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        if(b == 0){
            System.out.println("Second number can not be 0. ");
        }
        if(a % b == 0){
            System.out.println(a + " is a multiple of " + b);
        }else{
            System.out.println(a + " is not multiple of " + b);
        }
    }
}
