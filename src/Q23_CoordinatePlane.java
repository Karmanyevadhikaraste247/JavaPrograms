//23. Determine the quadrant of a point (x, y) in the coordinate plane.
                                                            //x == 0 && y == 0 → Origin
                                                           //x == 0 && y != 0 → Y-axis
//          y                                               //y == 0 && x != 0 → X-axis
//          ↑
//     II   |   I
// (-,+)    | (+,+)
//-----------+----------→ x
//     III  |   IV
// (-,-)    | (+,-)
//          ↓
import java.util.Scanner;
public class Q23_CoordinatePlane {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        if(x == 0 && y == 0){
            System.out.println("Origin");
        }else if(x == 0 && y != 0){
            System.out.println("Y-axis");
        }else if(y == 0 && x != 0){
            System.out.println("X-axis");
        }else if(x > 0 && y > 0){
            System.out.println("Quadrant I");
        }else if(x < 0 && y > 0){
            System.out.println("Quadrant II");
        }else if(x < 0 && y < 0){
            System.out.println("Quadrant III");
        }else{
            System.out.println("Quadrant IV");
        }
    }
}
