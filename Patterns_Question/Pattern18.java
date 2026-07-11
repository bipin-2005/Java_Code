/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

E 
D E 
C D E 
B C D E 
A B C D E

Print the pattern in the function given to you.*/
package Patterns_Question;

import java.util.Scanner;

public class Pattern18{
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        char last = (char) ('A' + range - 1);
        for(int i=0;i<range;i++){
            for(char j=(char)(last- i);j<=last;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        input.close();
    }
}
