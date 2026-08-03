//21. Simple calculator using switch (add, subtract, multiply, divide).
import java.util.Scanner;
public class Q21_SimpleCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        System.out.println("Enter your case number: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
          System.out.println("Addition is: " + (a + b));
                break;
            case 2:
          System.out.println("Subtraction is: " + (a - b));
                break;
            case 3:
          System.out.println("Multiplication is: " + (a * b));
                break;
            case 4:
          System.out.println("Division is: " + (a / b));
                break;
            default:
          System.out.println("Enter a valid number. ");
        }
    }
}
