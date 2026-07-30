//7. Find area and perimeter of a rectangle.
import java.util.Scanner;
public class PerimeterTriangle {
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your length: ");
        double l = sc.nextDouble();
        System.out.println("Enter your width: ");
        double w = sc.nextDouble();
        double area = l * w;
        System.out.println("Area: " + area);
        double perimeter = (2 * l) + (2 * w);
        System.out.println("Perimeter: " + perimeter);
    }

}
