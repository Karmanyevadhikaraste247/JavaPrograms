//35. Reverse a given number (e.g. 123 → 321).
import java.util.Scanner;
public class Q35_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
              while(n>0){
            int digit = n % 10;
            n = n / 10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }
}
