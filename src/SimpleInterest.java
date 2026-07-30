//5. Calculate simple interest (P, R, T as inputs)
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your principle amount: ");
        double P = sc.nextDouble();
        System.out.println("Enter your rate of interest: ");
        double R = sc.nextDouble();
        System.out.println("Enter your interest time: ");
        double T = sc.nextDouble();
        double SI = (P * R * T) / 100;
        System.out.println("Your simple interest is: " + SI);
        double totalAmount = SI + P;
        System.out.println("Your total amount is: " + totalAmount);

    }
}
