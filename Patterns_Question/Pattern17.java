/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

Print the pattern in the function given to you.*/
package Patterns_Question;

import java.util.Scanner;

public class Pattern17{
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i =0;i<range;i++){
            for(int j=0;j<range-i-1;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint)ch++;
                else ch--;
            }
            System.out.println();
        }
        input.close();
    }
}
