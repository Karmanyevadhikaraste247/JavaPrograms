//6. Calculate compound interest
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your principal amount: ");
        double P = sc.nextDouble();
        System.out.println("Enter your rate of interest: ");
        double R = sc.nextDouble();
        System.out.println("Enter your time: ");
        double T = sc.nextDouble();
        double Amount = P * Math.pow((1 + R / 100), T);
        double CompoundInterest = Amount - P;
        System.out.println("Amount: " + Amount);
        System.out.println("Compound Interest is : " + CompoundInterest);

    }
}
