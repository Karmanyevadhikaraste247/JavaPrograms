//30. Find the sum of all even numbers from 1 to N.
/*import java.util.Scanner;
public class Q30_SumEvenNum1ToN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
         if(i % 2 == 0)
             sum = sum + i;
        }
        System.out.println("Sum of all even: " + sum);
    }
}*/

import java.util.Scanner;
public class Q30_SumEvenNum1ToN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i += 2){
            sum = sum + i;
        }
            System.out.println("Sum of even numbers: " + sum);
    }
}
