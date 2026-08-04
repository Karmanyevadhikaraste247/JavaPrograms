//29. Find the sum of first N natural numbers.
import java.util.Scanner;
public class Q29_SumNNatural {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
       // int sum = 0;
        //for(int i = 1; i <= n; i++){
          //  sum = sum + i;
        //}
        int sum = n * (n + 1) / 2;
        System.out.println("Sum is: " + sum);
    }
}
