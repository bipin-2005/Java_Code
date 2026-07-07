package Patterns_Question;

import java.util.Scanner;

public class Pattern8 {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i=0;i<range;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*range - (2*i+1);j++){
                System.out.print("*");
            }
        }
        input.close();
    }
}
