package patterns_Question;

import java.util.Scanner;

public class Pattern7 {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your range : ");
        int range = input.nextInt();
        for(int i=0;i<range;i++){
            for(int j=0;j<=range-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<=range-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");

        }
        input.close();
    }
}
