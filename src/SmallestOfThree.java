//12. Find the smallest of three numbers.
import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < b && a < c){
            System.out.println("Smallest of three is: " + a);
        }else if(b < a && b < c){
            System.out.println("Smallest of three is: " + b);
        }else{
            System.out.println("Smallest of three is: " + c);
        }
    }
}
