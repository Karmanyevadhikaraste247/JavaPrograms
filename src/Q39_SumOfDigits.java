//39. Find the sum of digits of a number
import java.util.Scanner;
public class Q39_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}
