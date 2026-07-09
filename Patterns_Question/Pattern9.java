/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    * 
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
Print the pattern in the function given to you.*/

package Patterns_Question;

import java.util.Scanner;

public class Pattern9 {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i=0;i<range;i++){
            for(int j=0;j<range-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");

            }
            for(int j=0;j<range-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=range-1;i>=0;i--){
            for(int j=range-i-2;j>=0;j--){
                System.out.print(" ");
            }

            for(int j=2*i+1;j>0;j--){
                System.out.print("*");

            }
            for(int j=range-i-2;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        input.close();
    }
}
