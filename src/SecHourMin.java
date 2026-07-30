//9. Convert total seconds into hours, minutes, and seconds.
import java.util.Scanner;
public class SecHourMin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your seconds: ");
        int s = sc.nextInt();
        int hour = s / 3600;
        int remainingSecond = s % 3600;
        System.out.println("Hour: " + hour);
        int minute = remainingSecond / 60;
        System.out.println("Minute: " + minute);
        int seconds = remainingSecond % 60;
        System.out.println("Seconds: " + seconds);

    }
}
