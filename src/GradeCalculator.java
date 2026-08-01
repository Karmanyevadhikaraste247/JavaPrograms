//15. Grade calculator: take marks as input and print letter grade (A/B/C/D/F).
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double m = sc.nextDouble();
        if(m < 0 || m >100){
            System.out.println("Your marks is invalid: ");
        }
        else if(m >= 90){
            System.out.println("Your marks grade is: A ");
        }else if(m >= 75){
            System.out.println("Your marks grade is: B ");
        }else if(m >= 60){
            System.out.println("Your marks grade is: C ");
        }else if(m >= 45){
            System.out.println("Your marks grade is: D ");
        }else{
            System.out.println("Your marks grade is: F ");
        }
    }
}
