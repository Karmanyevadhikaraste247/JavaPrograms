//49. Print a number pyramid: 1 / 12 / 123 / ...
package Pattern;
import java.util.Scanner;
public class Q49_NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
