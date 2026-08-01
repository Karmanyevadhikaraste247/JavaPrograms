//17. BMI calculator with category (Underweight / Normal / Overweight / Obese).
import java.util.Scanner;
public class Q17_BMICalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight(kg): ");
        double w = sc.nextDouble();
        System.out.println("Enter your height(f): ");
        double h = sc.nextDouble();
        double bmi = w / (h * h);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if(bmi < 18.5){
            System.out.println("Category: Underweight");
        }else if(bmi < 25){
            System.out.println("Category: Normal");
        }else if(bmi < 30){
            System.out.println("Category: Overweight");
        }else{
            System.out.println("Category: Obese");
        }
    }
}
