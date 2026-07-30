//10. Calculate the average of 3 numbers.
import java.util.Scanner;
public class AveOfThreeNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Average of three is: " + average);
    }
}
