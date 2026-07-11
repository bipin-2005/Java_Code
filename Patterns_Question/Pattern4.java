package patterns_Question;
import java.util.Scanner;
public class Pattern4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i=1;i<range;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        input.close();
    }
}
