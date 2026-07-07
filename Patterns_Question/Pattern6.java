package Patterns_Question;
import java.util.Scanner;
public class Pattern6 {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your range : ");
        int range = input.nextInt();
        for(int i=0;i<=range;i++){
            for(int j=1;j<=range-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        input.close();
    }
}
