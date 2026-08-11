import java.util.Scanner;                                               /*
Original formula:
C(n,r) = n! / (r!(n-r)!)

Previous → Next formula:
next = current × (n-r)/(r+1)
                                                                        */
public class Q52_PascalTriangleUpToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int s = 1; s <= n - i; s++)
                System.out.print(" ");
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j);
            }
            System.out.println();
        }
    }
}
/*
import java.util.Scanner;

public class Q52_PascalTriangleUpToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            for(int s = 1; s <= n - i; s++)
                System.out.print(" ");

            int num = 1;

            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = num * (i - j) / j;
            }

            System.out.println();
        }
    }
}
*/