//37. Print Fibonacci series up to N terms.
import java.util.Scanner;
public class Q37_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= n; i++){
            c = a + b;
            System.out.println(c);
        a = b;
        b = c;
    }
    }
}
