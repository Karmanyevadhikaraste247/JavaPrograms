//3. Check if a number is even or odd.
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Your number is Even: ");
        }else{
            System.out.println("Your number is Odd: ");
        }
    }
    }
