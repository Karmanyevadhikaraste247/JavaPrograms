//1. Swap two numbers without using a third variable.
import java.util.Scanner;
public class SwapWithThird {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        System.out.println("Before swapping: " + a + " " + b);
        //System.out.println("Before swapping: " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: " + a + " " + b);
      // System.out.println("After swapping: " + b);

}}
