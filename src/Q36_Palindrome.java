//36. Check if a number is a palindrome (e.g. 121 is palindrome).
import java.util.Scanner;
public class Q36_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n>0){
            int digits = n % 10;
            n = n / 10;
            rev = rev * 10 + digits;
        }
        if(original==rev){
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not Palindrome.");
        }
    }
}
