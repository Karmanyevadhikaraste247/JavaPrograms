//32. Check if a number is prime
//Boolean Variable
import java.util.Scanner;
public class Q32_Prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime =  false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Your number is prime: ");

        }else{
            System.out.println("Your number is not prime: ");
        }
    }
}

// count variable
/*import java.util.Scanner;
public class Q32_Prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
        if(n % i == 0){
            count++;
        }
        }
        if(count == 2){
            System.out.println("Prime.");
        }else{
            System.out.println("Not prime.");
        }
        }
    }*/
//Direct Print + Break
/*import java.util.Scanner;
public class Q32_Prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int i;
        for( i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println("Not prime.");
                break;
            }
        }
        if(i == n){
            System.out.println("Prime");
        }
        }
    }*/

/*import java.util.Scanner;
public class Q32_Prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        if(n <= 1){
            System.out.println("Not prime");
            return;
        }
        boolean isPrime = true;
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        System.out.println("Prime.");
        else
            System.out.println("Not prime.");
        }
    }*/

