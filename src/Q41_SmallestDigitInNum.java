//41. Find the smallest digit in a number
import java.util.Scanner;
public class Q41_SmallestDigitInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int smallest = n % 10;
        while (n > 0){
            int digit = n % 10;
            n = n / 10;
            if(digit  < smallest){
                smallest = digit;
            }
        }
        System.out.println("Smallest number is: " + smallest);
    }
}
