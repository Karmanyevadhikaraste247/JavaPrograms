//38. Count the number of digits in a given number.
import java.util.Scanner;
public class Q38_CountDigit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0) {
            int digit = n % 10;
            n = n / 10;
            count++;

        }
        System.out.println(count);
    }
}
