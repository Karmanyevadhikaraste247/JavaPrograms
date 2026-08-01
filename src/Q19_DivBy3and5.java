//19. Check if a number is divisible by both 3 and 5.
import java.util.Scanner;
public class Q19_DivBy3and5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("Divisible by both: ");
        }else{
            System.out.println("Not divisible: ");
        }
    }
}
