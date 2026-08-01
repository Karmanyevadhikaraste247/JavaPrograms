//14. Check if a given year is a leap year.
import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year: ");
        int y = sc.nextInt();
        if(y % 400 == 0 || ( y % 4 == 0 && y % 100!= 0)){
            System.out.println("Your year is a leap year: " + y);
        }else{
            System.out.println("Your year is not a leap year: ");
        }
    }
}
