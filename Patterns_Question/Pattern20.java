/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A
BB
CCC
DDDD
EEEEE

Print the pattern in the function given to you.*/
package Patterns_Question;

import java.util.Scanner;

public class Pattern20{
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i=0;i<range;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(i+65));
            }
            System.out.println();
        }
        input.close();
    }
}
