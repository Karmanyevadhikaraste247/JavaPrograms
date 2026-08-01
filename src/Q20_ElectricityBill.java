//20. Calculate electricity bill based on slab-wise unit rates.
import java.util.Scanner;
public class Q20_ElectricityBill {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your unit: ");
        double units = sc.nextDouble();
        double bill;
        if(units <= 100)
            bill = units * 2;
        else if(units <= 200)
            bill = 100 * 2 + (units - 100) * 4;
        else if(units <= 300)
            bill = 100 * 2 + 100 * 4 + (units - 200) * 6;
        else
            bill = 100 * 2 + 100 * 4 + 100 * 6 + (units - 300) * 7.5;
        System.out.println("Electricity bill: " + bill);
    }
}
