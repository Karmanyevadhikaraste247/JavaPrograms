//16. Check if a triangle is valid given three sides.
import java.util.Scanner;
public class Q16_ValidTriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your triangle sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a + b) > c  && (a + c) > b && (b + c) > a) {
            System.out.println("Your triangle is valid: ");
        }else{
            System.out.println("Your triangle is not valid: ");
        }
    }
}
