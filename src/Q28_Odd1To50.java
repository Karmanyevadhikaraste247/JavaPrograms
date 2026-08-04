//28. Print all odd numbers from 1 to 50
public class Q28_Odd1To50 {
    public static void main(String[]args){
        for(int i = 1; i <= 50; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
