//43. Find the GCD (Greatest Common Divisor) of two numbers.
/*import java.util.Scanner;
public class Q43_GCD {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        while (b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println("GCD = " + a);
    }
}*/

import java.util.Scanner;
public class Q43_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD = " + gcd);
    }
}
