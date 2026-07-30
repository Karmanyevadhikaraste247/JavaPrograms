//4. Convert Celsius to Fahrenheit and vice versa.
import java.util.Scanner;
public class CelsiustoFahrenheit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius  * 9 /5) + 32;
        System.out.println("Fahrenhiet = " + fahrenheit);
        System.out.println("Enter your fahrenheit: ");
         fahrenheit = sc.nextDouble();
         celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius = " + celsius);
    }
}
