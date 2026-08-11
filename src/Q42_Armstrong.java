//42. Check if a number is an Armstrong number (e.g. 153 = 1³+5³+3³).
/*import java.util.Scanner;
public class Q42_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0){
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit * digit * digit;
        }
        if(temp==sum)
        System.out.println("It's an Armstrong number: ");
         else
             System.out.println("It's not an Armstrong number: ");
    }

}*/

import java.util.Scanner;
public class Q42_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int temp = n;
        int count = 0;
        int sum = 0;
        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        while (n > 0){
            int digit = n % 10;
            n = n / 10;
            int power = 1;
            for(int i = 1; i <= count; i++){
                power = power * digit;
            }
            sum = sum + power;
        }
        if(sum==original)
            System.out.println("It's an Armstrong number.");
        else
            System.out.println("It's not an Armstrong number.");
    }
}
