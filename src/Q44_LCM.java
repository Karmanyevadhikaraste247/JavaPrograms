//44. Find the LCM (Least Common Multiple) of two numbers.
import java.util.Scanner;
public class Q44_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a = sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int lcm = 1;
        for(int i =1; ; i++){
            int multiple = a * i;
            if(multiple % b == 0){
                lcm = multiple;
                break;
            }
        }
        System.out.println("LCM = " + lcm);
    }
}
